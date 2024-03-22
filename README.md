**Configuration**
1. Open the `src/test/resources/application.yaml` file.
2. Update with your credentials:

    ```yaml
    general:
      username: YOUR_API_KEY_HERE
    ```
**Usage**
```
mvn clean test  
mvn allure:serve 
```

To run a specific test class using Maven, execute the following command in the terminal:

```
mvn clean test -Dtest=TestClassName
```
### **Tests:**
### Get all orders

| № | Check name                                    | Status |
|---|-----------------------------------------------|--------|
| 1 | Get all orders information and check response | Pass   |

### Create an order

| № | Check name                                            | Status |
|---|-------------------------------------------------------|--------|
| 1 | Create an order with correct data and check response  | Pass   |

### Delete an order

| № | Check name                                                      | Status |
|---|-----------------------------------------------------------------|--------|
| 1 | Create an order with correct data, delete it and check response | Pass   |