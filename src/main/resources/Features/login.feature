Feature: Login functionality

  Background:
    Given user on the login page

  @smoke @regression
  Scenario: 1.Verify the login functionality with correct username and password
    When user types username
    And user types password
    And user clicks on the login button
    Then user lands on the homepage
    And user logs out

  @regression @manual @Epic-001
  Scenario: 2.Verify the login functionality with correct username and password
    When user types "venkatm"
    And user types "p"
    And user clicks on the login button
    Then user lands on the homepage

  @regression @manual @Epic-001
  Scenario: 3.Verify the login functionality with correct username and password
    When user types the following usernames
      | user1 | user2 | user3 |
      | user4 | user5 | user6 |
    And user types "p"
    And user clicks on the login button
    Then user lands on the homepage


  @regression @datadriven
  Scenario Outline: 4. Verify the user login
    When user types "<username>"
    And user types "p"
    And user clicks on the login button
    Then user lands on the homepage
    Examples:
      | username |
      | user1    |
      | user2    |
      | user3    |
      | user4    |
      | user5    |
      | user6    |