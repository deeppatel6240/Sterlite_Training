package com.phoenix.rest.hello;
/*
 * Crator Name: deepkumar.sherathiya@stltech.in
 * Date: 29/06/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/profile")
public class ProfileService {
	
	@POST
	@Path("/add")
	@Produces(MediaType.TEXT_HTML)
	public Response addProfile(@QueryParam("name") String name,
								@QueryParam("age") int age,
								@QueryParam("city") String city) {
		
		String output = "<html>"
						+ "<body"
						+ "<h1>" + "Profile is createed" + "</h1>"
						+ "<h2>"
						+ "name is:" + name
						+ "age is:" + age
						+ "city is:" + city
						+ "</h2>"
						+ "</body>"
						+ "</html>";
		
		return Response.status(200)
				.entity(output)
				.build();
	}
}

//end of the class


