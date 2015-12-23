package com.argela.jersey.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/get-data")
public class HelloRestService {
	
    @GET
    public Response handleGet(){
    	
    	return Response.ok().entity("Yes, it works..").build();
    	
    }

}
