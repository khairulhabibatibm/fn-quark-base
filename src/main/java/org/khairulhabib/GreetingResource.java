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
    @Produces("application/json")
    @Consumes("application/json")
    public Message run() {
        System.out.println("Inside run2");
        Message msg = new Message();
        msg.setMessage("Run");
        msg.setStatus("00");
        return msg;
    }

    @POST
    @Path("/")
    @Produces("application/json")
    @Consumes("application/json")
    public Message hello() {
        System.out.println("Inside hello2");
        Message msg = new Message();
        msg.setMessage("Hello");
        msg.setStatus("00");
        return msg;
    }

    @GET
    @Path("/health_check")
    public Response healthCheck() {
        System.out.println("/health_check");
        return Response.ok().build();
    }
}