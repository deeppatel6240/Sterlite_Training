package com.phoenix.rest.hello;
/*
 * Crator Name: deepkumar.sherathiya@stltech.in
 * Date: 29/06/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */
import java.time.LocalDate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/helloquery")
public class HelloServiceQueryParam {
		
	@GET
	@Path("/greet")
	@Produces(MediaType.TEXT_PLAIN)
	public String greetUser(@QueryParam("nm") String name) {
		return "Hello" + name;
	}
	
	@GET
	@Path("/user")
	@Produces("text/html")
	public Response getUserWithResponse(@QueryParam("nm") String name) {
		
		String output ="<html>"
				+ "<body>"
				+ "<h1> Hello, " + name + "This is HTML"
				+ "</body>"
				+ "</html>";
		
		return Response.status(200)
				.entity(output)
				.build();
	}
	
	@GET
	@Path("/date")
	@Produces(MediaType.TEXT_HTML)
	public Response getDate(@QueryParam("dd") int day,
							@QueryParam("mm") int month,
							@QueryParam("yy") int year) {
		String output ="<html>"
				+ "<body>"
				+ "<h1> Date is:" + LocalDate.of(year, month, day) + "This is HTML"
				+ "</body>"
				+ "</html>";
		
		return Response.status(200)
				.entity(output)
				.build();
	}	
	
}

// end of the class
