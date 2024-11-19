Feature: Signup Functionality

  Scenario: Successful Signup
    Given the user is on the signup page
    When the user enters "John" as first name and "Doe" as last name
    And "john.doe@example.com" as email and "Password@123" as password
    And clicks on the "Create an Account" button
    Then the user should see a welcome message on the dashboard
