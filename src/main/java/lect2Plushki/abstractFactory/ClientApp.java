package lect2Plushki.abstractFactory;

public class ClientApp {
    public static void main(String[] args) {
        DBType type = DBType.valueOf(args[0]);

        DBConnector dbConnector = DBConnectorFactory.getConnection(type);

        Connection connection = dbConnector.connect();
        System.out.println(connection);
        boolean discResult = dbConnector.disconnect();
        System.out.println(discResult);
    }
}
