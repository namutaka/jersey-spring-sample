package myapp.resources;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Component
public class ImplementsConfigResource implements ConfigResource {

    @Resource
    private HttpServletRequest httpRequest;

    @Override
    public String config() {
        return "config : " + httpRequest.getHeader("User-Agent");
    }
}
