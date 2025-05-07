Feature: User API Testing

  Scenario: Get Users details
    Given the API endpoint is "https://reqres.in/api/users?page=2"
    When I send a GET request to the endpoint
    Then the response status code should be 200
    And the response should contain "page"