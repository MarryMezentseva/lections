package lect2Plushki.abstractFactory;

public interface DBConnector {
    Connection connect();
    boolean disconnect();
}
