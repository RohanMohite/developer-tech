package com.sample.rest;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

/**
* Created by Rohan Jayraj Mohite on 24/06/2016.
*/

@Provider
@Path("swagger")
@Api(value="/swagger",description="hello Swagger")
public class SwaggerRestService {

	@GET
	@Path("/printMessage")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="hello swagger",response=String.class)
	public String printMessage(@ApiParam(value="message") @PathParam("param") String msg) {
		return "Hello : " + msg;
	}	
}
