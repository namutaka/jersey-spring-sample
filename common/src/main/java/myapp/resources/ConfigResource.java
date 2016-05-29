package myapp.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/config")
public interface ConfigResource {

    @GET
    String config();
}
