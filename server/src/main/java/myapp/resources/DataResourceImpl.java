package myapp.resources;

import myapp.model.Data;
import myapp.services.DataService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.QueryParam;
import java.util.logging.Logger;

@Component
public class DataResourceImpl implements DataResource {
    private static Logger log = Logger.getLogger(DataResourceImpl.class.getName());

    @Resource
    private HttpServletRequest httpRequest;

    @Resource
    private DataService dataService;

    @Override
    public Data getData(@QueryParam("name") String name) {
        return dataService.create(
                name,
                "UserAgent:" + httpRequest.getHeader("User-Agent")
        );
    }
}
