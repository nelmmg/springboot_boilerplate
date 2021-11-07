package com.ng.boilerplate.controller;

import com.ng.boilerplate.model.BoilerResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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


  @Operation(
          summary = "Return an Hello Boiler",
          description = "Returns the OK for the boilerplate",
          tags = { "boilerplate" })
  @ApiResponses(value = {
          @ApiResponse(responseCode = "200", description = "successful operation",
                  content = @Content(schema = @Schema(implementation = BoilerResponse.class))) })
  @RequestMapping(
      value = "/getBoiler",
      method = RequestMethod.GET,
      produces = "application/json")
  public BoilerResponse getBoiler() {
    LOGGER.info("Received boiler request");
    return new BoilerResponse("Hi, I'm the boiler!");
  }

}
