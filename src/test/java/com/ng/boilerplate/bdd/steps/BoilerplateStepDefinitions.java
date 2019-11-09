package com.ng.boilerplate.bdd.steps;

import com.ng.boilerplate.bdd.SpringCucumberIT;
import com.ng.boilerplate.model.BoilerResponse;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;

public class BoilerplateStepDefinitions extends SpringCucumberIT {

  private final Logger LOGGER = LoggerFactory.getLogger(BoilerplateStepDefinitions.class);

  private ResponseEntity<BoilerResponse> response;

  @Given("I want call the boilerplate")
  public void givenEndpoint() {
   /* Nothing to prepare here
      In some cases you need to prepare data, eg. when the method has an input
    */
  }

  @When("Make the request")
  public void hitEndpoint() {
    response = restTemplate.getForEntity(getBaseUrl() + "/getBoiler", BoilerResponse.class);
  }

  @Then("Should return boiler message")
  public void returnRandomNumber() {
    Assert.assertTrue("Should return successful response",
        response.getStatusCode().is2xxSuccessful());

    Assert.assertNotNull("Body cannot be null", response.getBody());
    Assert.assertEquals("Hi, I'm the boiler!", response.getBody().getMessage());

  }

}
