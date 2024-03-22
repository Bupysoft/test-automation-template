package delivery.api;

import delivery.dto.OrderDto;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import delivery.utils.ApiClient;

import static delivery.utils.ApiClient.createOrder;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest extends BaseSetupApi {

    @Test
    void getOrderInformationAndCheckResponse() {
        Response response = ApiClient.getOrders(getAuthenticatedRequestSpecification());

        Assertions.assertEquals(HttpStatus.SC_OK, response.getStatusCode(), "Status code is OK");
    }

    @Test
    void createOrderAndCheckResponse() {
        Response response = createOrder(getAuthenticatedRequestSpecification(), OrderDto.createRandomOrder());

        Assertions.assertAll("Order creation",
                () -> Assertions.assertEquals(HttpStatus.SC_OK, response.getStatusCode(), "Status code is OK"),
                () -> Assertions.assertEquals("OPEN", response.path("status"), "New order status is OPEN"),
                () -> Assertions.assertNotEquals(0, (int) response.path("id"), "New order ID not equal 0")
        );
    }

    @Test
    void deleteOrderByIdAndCheckResponse() {
        Response responseOrderCreation = createOrder(getAuthenticatedRequestSpecification(), OrderDto.createRandomOrder());
        int orderId = responseOrderCreation.getBody().path("id");

        Response responseOrderDeletion = ApiClient.deleteOrderById(getAuthenticatedRequestSpecification(), orderId);

        Assertions.assertAll("Order deletion",
                () -> Assertions.assertEquals(HttpStatus.SC_OK, responseOrderDeletion.getStatusCode(), "Order deletion status code is OK"),
                () -> Assertions.assertEquals("true", responseOrderDeletion.getBody().asString(), "Order deletion response body is true")
        );
    }

}