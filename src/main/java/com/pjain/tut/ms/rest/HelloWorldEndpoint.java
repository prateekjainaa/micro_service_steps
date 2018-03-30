package com.pjain.tut.ms.rest;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.pjain.tut.ms.data.PersistenceHelper;
import com.pjain.tut.ms.pojo.Employee;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloWorldEndpoint {

    @GET
    @Produces("text/plain")
    public Response doGet() {
        return Response.ok("Hello from WildFly Swarm!").build();
    }

    @Inject
    PersistenceHelper helper;

    @GET
    @Produces("application/json")
    @Path("/data")
    public Employee[] get() {
        return helper.getEntityManager().createNamedQuery("Employee.findAll", Employee.class).getResultList()
                .toArray(new Employee[0]);
    }

}