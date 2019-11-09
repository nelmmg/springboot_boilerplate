package com.ng.boilerplate.controller;

import com.ng.boilerplate.model.BoilerResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoilerplateController {

  private static final Logger LOGGER = LoggerFactory.getLogger(BoilerplateController.class);


  @Autowired
  public BoilerplateController() {
    // Add any injection dependency here
  }

  @ApiOperation(value = "Get boiler plate response", nickname = "getBoiler")
  @ApiResponses(value = { @ApiResponse(code = 200, message = "OK") })
  @RequestMapping(
      value = "/getBoiler",
      method = RequestMethod.GET,
      produces = "application/json")
  public BoilerResponse getBoiler() {
    LOGGER.info("Received boiler request");
    return new BoilerResponse("Hi, I'm the boiler!");
  }

}
