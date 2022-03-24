Feature: Shopping

  Scenario: User should find and check the specific results
    Given  User open the main page of gurman
    When   User search by keyword "pegas"
    Then   User the valid search results are displayed by keyword related on the title
