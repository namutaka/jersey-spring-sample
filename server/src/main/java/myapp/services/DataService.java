package myapp.services;

import myapp.model.Data;
import org.springframework.stereotype.Component;

@Component
public class DataService {

    public Data create(String name, String value) {
        Data d = new Data();
        d.setId(10);
        d.setName(name);
        d.setValue(value);
        return d;
    }
}
