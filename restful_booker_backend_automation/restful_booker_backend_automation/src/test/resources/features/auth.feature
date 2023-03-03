Feature: creates a new auth token to use for access to the PUT and DELETE booking

  @CreateAuthToken
  Scenario: create a new authorization token
    Given the user prepares the service
    When the user sends the credentials to create a new auth token
    Then the user will get the status code 200
