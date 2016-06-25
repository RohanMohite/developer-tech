package com.sample.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

/**
* Created by Rohan Jayraj Mohite on 24/06/2016.
*/

public class SwaggerRestServiceApplication extends Application {

	HashSet<Object> singletons = new HashSet<Object>();

	   public SwaggerRestServiceApplication()
	   {
	      singletons.add(new SwaggerRestService());
	   }

	   //register provider here like exceptionhandler in resteasy
	   @Override
	   public Set<Class<?>> getClasses()
	   {
	      HashSet<Class<?>> set = new HashSet<Class<?>>();
	      return set;
	   }

	   @Override
	   public Set<Object> getSingletons()
	   {
	      return singletons;  
	   }
}
