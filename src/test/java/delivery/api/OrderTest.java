package delivery.api;

import delivery.dto.OrderDto;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import delivery.utils.ApiClient;

public class OrderTest extends BaseSetupApi {

    @Test
    void getOrderInformationAndCheckResponse() {

        Response response = ApiClient.getOrders(getAuthenticatedRequestSpecification() );

        Assertions.assertAll("Test description",
                () -> Assertions.assertEquals(HttpStatus.SC_OK, response.getStatusCode(), "Status code is OK")
        );

    }
    @Test
    void createOrderAndCheckResponse() {
        // Создание заказа
        OrderDto orderDto = OrderDto.createRandomOrder();
        Response response = ApiClient.getOrders(getAuthenticatedRequestSpecification());

        // Проверка статуса ответа и наличия id и отсутствия courierID
        Assertions.assertAll("Check order response",
                () -> Assertions.assertEquals(HttpStatus.SC_OK, response.getStatusCode(), "Status code is OK"),
                () -> Assertions.assertNotNull(response.getBody().path("id"), "Order ID is not null"),
                () -> Assertions.assertNull(response.getBody().path("courierID"), "Courier ID is null")
        );
    }
}