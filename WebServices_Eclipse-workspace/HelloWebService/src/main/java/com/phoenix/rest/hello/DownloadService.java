package com.phoenix.rest.hello;

/*
 * Crator Name: deepkumar.sherathiya@stltech.in
 * Date: 29/06/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/download")
public class DownloadService {
	
	// text format
	@GET
	@Path("/textfile")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getTextFile() {
		File file = new File("/home/deeppatel6240/Deep/hello_client.txt");
		
		return Response.ok(file)
				.header("Content-Disposition",  "attachment; filename='hello_client.txt'")
				.build();
	}
	
	// pdf format
	@GET
	@Path("/pdf")
	@Produces("application/pdf")
	public Response getPdfFile() {
		File file = new File("/home/deeppatel6240/Deep/deepkumar Sherathiya.pdf");
		
		return Response.ok(file)
				.header("Content-Disposition",  "attachment; filename='deepkumar Sherathiya.pdf'")
				.build();
		
	}
	
	// jpg format
	@GET
	@Path("/photo")
	@Produces("image/jpg")
	public Response getImage() {
		File file = new File("/home/deeppatel6240/Deep/xyz.jpg");

		return Response.ok(file)
				.header("Content-Disposition", "attachment; filename='xyz.jpg'")
				.build();

		}
		
}

// end of the class

