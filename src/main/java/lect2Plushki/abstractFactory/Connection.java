package lect2Plushki.abstractFactory;

import java.util.UUID;

public class Connection {
    private String id = UUID.randomUUID().toString();

    public String getId() {
        return id;
    }
}
