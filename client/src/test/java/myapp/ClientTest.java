package myapp;

import myapp.client.ClientFactory;
import myapp.model.Data;
import myapp.resources.DataResource;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

public class ClientTest {

    private final static String apiBaseUrl =
            System.getenv("API_BASE_URL");

    @Test
    public void testClient() throws Exception {
        DataResource resource = ClientFactory.instance(apiBaseUrl);

        Data act = resource.getData("hoge");
        assertThat(act, allOf(
                notNullValue(),
                hasProperty("name", is("hoge"))
        ));
    }
}
