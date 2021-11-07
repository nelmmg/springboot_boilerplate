package com.ng.boilerplate.controller;

import com.ng.boilerplate.model.BoilerResponse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class BoilerplateControllerTest {

  private BoilerplateController controller;

  @Before
  public void setup() {
    // Instantiate the mocks - NA on this case - just for reference
    MockitoAnnotations.openMocks(this);

    // Create the controller with any mocks you have
    controller = new BoilerplateController();
  }

  @Test
  public void getRandomNumber_shouldReturnRandomValueBody() {

    BoilerResponse boilerResponse = controller.getBoiler();
    Assert.assertNotNull("The object cannot be null", boilerResponse);
    Assert.assertEquals("Hi, I'm the boiler!", boilerResponse.getMessage());

  }

}
