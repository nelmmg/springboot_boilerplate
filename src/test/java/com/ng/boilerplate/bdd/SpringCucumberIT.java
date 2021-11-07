package com.ng.boilerplate.bdd;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Ignore
public class SpringCucumberIT {

  protected TestRestTemplate restTemplate;
  protected ObjectMapper objectMapper;

  private final String SERVER_URL = "http://localhost";

  @LocalServerPort
  protected int port;

  public SpringCucumberIT() {
    this.restTemplate = new TestRestTemplate();
    this.objectMapper = new ObjectMapper();
  }

  protected String getBaseUrl() {
    return SERVER_URL + ":" + port;
  }

  @Test
  public void smoke() {}

}
