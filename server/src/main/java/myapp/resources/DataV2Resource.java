package myapp.resources;

import myapp.model.Data;
import myapp.services.DataService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Component
@Path("/api/v2/data")
public class DataV2Resource {

    @Resource
    private DataService dataService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Data getData(@QueryParam("name") String name,
                        @HeaderParam("User-Agent") String userAgent) {
        return dataService.create(
                name,
                "UserAgent:" + userAgent
        );
    }
}
