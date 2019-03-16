package lect2Plushki.abstractFactory.impl;

import lect2Plushki.abstractFactory.Connection;
import lect2Plushki.abstractFactory.DBConnector;

import java.util.Random;

public class MySQLDBConnector implements DBConnector {
    @Override
    public Connection connect() {
        return new Connection();
    }

    @Override
    public boolean disconnect() {
        return new Random().nextBoolean();
    }
}
