@complete
Feature: Create account on the Mugento store

  Scenario: Attempt to create an account with duplicate info
    Given that i'm on the home page of the website
    And i click on the Create an Account button
    And i fill in all the required fields with data
    And i click on the button to finish the process
    Then i can see the error message displayed on the website