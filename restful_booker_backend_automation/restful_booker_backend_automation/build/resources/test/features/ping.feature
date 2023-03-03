Feature: consume health check endpoint to confirm whether the API is up and running

  @HealthCheck @HappyPath
  Scenario: confirm whether the api is up and running
    Given the user prepares the service
    When the user consumes the HealthCheck
    Then the user will get the status code 201
