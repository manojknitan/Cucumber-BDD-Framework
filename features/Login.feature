Feature: Login

  Scenario: Successful login with valid credentials
    Given launch chrome browser
    When open url "http://admin-demo.nopcommerce.com/login"
    And enter email as "admin@yourstore.com" and password "admin"
    And click to login
    Then page title displayed or not? "Dashboard / nopCommerce administration"
    When click on logout
    And close the browser