package com.gvaramaraju.microprofile.greet.api;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/** */
@Path("/greet")
@Singleton
public class HelloController {

  @GET
  public String greet() {
    return "Hello World!!";
  }
}
