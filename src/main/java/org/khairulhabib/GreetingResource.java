package org.khairulhabib;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
@Produces("application/json")
@Consumes("application/json")
public class GreetingResource {

    @POST
    @Path("/init")
    public Response init() {
        System.out.println("Inside init");
        return Response.ok().build();
    }

    @POST
    @Path("/run")
    public Response run() {
        System.out.println("Inside run");
        Message msg = new Message();
        msg.setMessage("Success");
        msg.setStatus("00");
        return Response.ok(msg).build();
    }

    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response hello() {
        System.out.println("Inside hello");
        Message msg = new Message();
        msg.setMessage("Success");
        msg.setStatus("00");
        return Response.ok(msg).build();
    }

    @GET
    @Path("/health_check")
    public Response healthCheck() {
        System.out.println("/health_check");
        return Response.ok().build();
    }
}