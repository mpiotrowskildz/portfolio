Feature: Login

  Scenario Outline: Logging in
    Given I have the login page opened
    When  I type the "<login>" login
    And I type the "<password>" password
    And I click login
    Then <expectedResult>
    Examples:
      | login    | password             | expectedResult     |
      | tomsmith | SuperSecretPassword! | I am logged in     |
      | tomsmith | 666                  | I am not logged in |