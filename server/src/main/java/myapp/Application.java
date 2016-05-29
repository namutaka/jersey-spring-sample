package myapp;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;

public class Application extends ResourceConfig {

    /**
     * Register JAX-RS application components.
     */
    public Application(){
        packages("myapp.resources");
        register(LoggingFilter.class);
    }

}
