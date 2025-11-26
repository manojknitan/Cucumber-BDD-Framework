Feature: OrangeHRM Login
  Scenario: Logo presence on Homepage
    Given launch chrome browser
    When open web home page
    Then verify if logo is present or not
    And close browser