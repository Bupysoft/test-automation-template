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

### **Homework 17:**
### Tallinn delivery login checklist

| № | Check name                             | Status |
|---|----------------------------------------|--------|
| 1 | Successful login with valid data       |        |
| 2 | Unsuccessful Login with empty fields   |        |
| 3 | Unsuccessful Login with wrong username |        |
| 4 | Unsuccessful Login with wrong password |        |
| 5 | RU Language switch check               |        |
| 5 | EN Language switch check               |        |


### Tallinn delivery login checklist
| № | Element name        | Xpath                            |
|---|---------------------|----------------------------------|
| 1 | Login text field    | //*[@data-name="username-input"] |
| 2 | Password text field | //*[@data-name="password-input"] |
| 3 | Sign In Button      | //*[@data-name="signIn-button"]  |
| 4 | RU language switch  | //button[text()='RU']            |
| 4 | EN language switch  | //button[text()='EN']            |

