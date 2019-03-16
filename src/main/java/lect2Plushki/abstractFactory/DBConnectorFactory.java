package lect2Plushki.abstractFactory;

import lect2Plushki.abstractFactory.impl.MySQLDBConnector;
import lect2Plushki.abstractFactory.impl.OracleDBConnector;
import lect2Plushki.abstractFactory.impl.PostgresDBConnector;

public final class DBConnectorFactory {

    private DBConnectorFactory() {
    }

    public static DBConnector getConnection(DBType type) {
        switch (type) {
            case MYSQL:
                return new MySQLDBConnector();
            case ORACLE:
                return new OracleDBConnector();
            case PGSQL:
                return new PostgresDBConnector();
            default:
                throw new RuntimeException();
        }
    }
}
