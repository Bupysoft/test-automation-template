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


### List of needed Web elements with their XPath
| № | Element name        | XPath                            |
|---|---------------------|----------------------------------|
| 1 | Login text field    | //*[@data-name="username-input"] |
| 2 | Password text field | //*[@data-name="password-input"] |
| 3 | Sign In Button      | //*[@data-name="signIn-button"]  |
| 4 | RU language switch  | //button[text()='RU']            |
| 4 | EN language switch  | //button[text()='EN']            |

### Additional task for [HTML document](https://drive.google.com/file/d/15Zlqvx4sW5WhWymnXEa0eu3o7N7aDY1e/view)
| № | Exercise name                                                        | Xpath                                 |
|---|----------------------------------------------------------------------|---------------------------------------|
| 1 | Select all td elements that contain "Name"                           | //td[contains(., 'Name')]             |
| 1 | Select all tr elements whose data-qa attribute starts with "amount-" | //tr[starts-with(@data-qa, 'amount-'] |
| 2 | Select all tr elements with td element including text "John Doe"     | //tr/td//*[text()="John Doe"]         |