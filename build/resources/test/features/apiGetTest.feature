Feature: apiGetTest

  Scenario: User should receive posts

    When User does GET request
    Then User receives lists of posts