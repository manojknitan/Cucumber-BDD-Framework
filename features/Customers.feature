Feature: Customers
  Scenario: Add new customer
    Given launch chrome browser
    When open URL "https://admin-demo.nopcommerce.com/login"
    And enter email as "admin@yourstore.com" and password as "admin"
    And click on login
    Then user can view dashboard
    When user click on customers menu
    And click on customers menu item
    And click on add new button
    Then user can view add new customer page
    When user enter customer info
    And click on save button
    Then user can view confirmation message "The new customer has been added successfully."
    And close browser
