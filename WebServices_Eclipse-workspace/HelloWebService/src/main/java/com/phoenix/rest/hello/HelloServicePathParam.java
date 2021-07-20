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
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/helloparam")

public class HelloServicePathParam {
	
	//greet user return string
	@GET
	@Path("/{nm}")
	@Produces(MediaType.TEXT_PLAIN)
	public String greetUser(@PathParam("nm") String name) {
		return "Hello" + name;
	}
	
	//greet user with response, return response as html
	@GET
	@Path("/user/{nm}")
	@Produces(MediaType.TEXT_HTML)
	public Response greetUserResponse(@PathParam("nm") String name) {
		return Response.status(200)
				.encoding("<body><h2>Hello User : " + name + "</h2></body>")
				.build();
	}
	
	//return date with response in getDate
	@GET
	@Path("/date/{dd}/{mm}/{yy}")
	@Produces(MediaType.TEXT_HTML)
	public Response getDate(@PathParam("dd") int day,
							@PathParam("mm") int month,
							@PathParam("yy") int year) {
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
