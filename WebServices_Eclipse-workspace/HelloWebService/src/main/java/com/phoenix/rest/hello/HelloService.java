package com.phoenix.rest.hello;
/*
 * Crator Name: deepkumar.sherathiya@stltech.in
 * Date: 29/06/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String sayPlainHello() {
    return "Hello world, this is Plain";
  }
  
  @GET
  @Path("/html")
  @Produces("text/html")
  public String sayHTMLHello() {
    return "<html>" + "<title>" + "hello" + "</title>"
    		+ "<body> <h2>" + "Hello world, this is HTML" + "</h2></body>" + "</html>";
    
    
  }
  
  @GET
  @Path("/xml")
  @Produces(MediaType.APPLICATION_XML)
  public String sayXMLHello() {
    return "<?xml version= \"1.0\"?>" + "<hello>Hello world, this is XML" + "</hello>";
  }
  
  
}
//end of the class