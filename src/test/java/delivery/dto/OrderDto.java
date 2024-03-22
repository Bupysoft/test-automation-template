package delivery.dto;

import delivery.utils.RandomDataGenerator;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class OrderDto {
    String status;
    int courierId;
    String customerName;
    String customerPhone;
    String comment;
    long id;

    public OrderDto(String status, int courierId, String customerName, String customerPhone, String comment, int id) {
        this.status = status;
        this.courierId = courierId;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.comment = comment;
        this.id = id;
    }
    public static OrderDto createRandomOrder() {
        String randomStatus = RandomDataGenerator.generateRandomString(10); // Генерация случайного статуса
        int randomCourierId = RandomDataGenerator.generateRandomNumber(1, 100); // Генерация случайного courierId
        String randomCustomerName = RandomDataGenerator.generateRandomString(10); // Генерация случайного имени клиента
        String randomCustomerPhone = RandomDataGenerator.generateRandomPhoneNumber(); // Генерация случайного номера телефона клиента
        String randomComment = RandomDataGenerator.generateRandomString(20); // Генерация случайного комментария
        int randomId = RandomDataGenerator.generateRandomNumber(1000, 9999); // Генерация случайного id
        return new OrderDto(randomStatus, randomCourierId, randomCustomerName, randomCustomerPhone, randomComment, randomId);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCourierId(int courierId) {
        this.courierId = courierId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setId(long id) {
        this.id = id;
    }
}
