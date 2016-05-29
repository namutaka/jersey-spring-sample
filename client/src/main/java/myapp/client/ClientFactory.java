package myapp.client;

import myapp.resources.DataResource;
import org.glassfish.jersey.client.proxy.WebResourceFactory;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MultivaluedHashMap;
import java.util.Arrays;
import java.util.Collections;

public class ClientFactory {

    public static DataResource instance(String baseUrl) {
        Client c = ClientBuilder.newClient();
        WebTarget target = c.target(baseUrl);

        MultivaluedHashMap<String, Object> headers = new MultivaluedHashMap<>();
        headers.put("User-Agent", Arrays.<Object>asList("myapp/1.0"));

        return WebResourceFactory.newResource(
                DataResource.class,
                target,
                false,
                headers,
                Collections.<Cookie>emptyList(),
                new Form());
    }
}
