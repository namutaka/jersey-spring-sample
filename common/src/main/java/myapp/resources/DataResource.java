package myapp.resources;

import myapp.model.Data;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/api/v1/data")
public interface DataResource {

    // https://jersey.java.net/documentation/latest/jaxrs-resources.html
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Data getData(@QueryParam("name") String name);
}
