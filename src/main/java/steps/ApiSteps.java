package steps;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.Map;

public class ApiSteps {

    private String endpoint;
    private Response response;

    @Given("the API endpoint is {string}")
    public void theApiEndpointIs(String url) {
        this.endpoint = url;
    }

    @When("I send a GET request to the endpoint")
    public void iSendAGetRequestToTheEndpoint() {
        response = RestAssured
                .given()
                .get(endpoint);
    }

    @Then("the response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int statusCode) {
        Assert.assertEquals(response.getStatusCode(), statusCode);
    }

    @Then("the response should contain {string}")
    public void theResponseShouldContain(String content) {
        Assert.assertTrue(response.asString().contains(content));
    }

}
