Feature: ApiPostTest

  Scenario: User should input the post of examples

    Given Create post with valid data
    When Send http post request
    Then Check status response
    And Check body response