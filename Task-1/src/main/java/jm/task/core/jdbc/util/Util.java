package jm.task.core.jdbc.util;

import jm.task.core.jdbc.util.util.ConnectionManager;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Util {
    public static Connection getConnection() {

        Connection connection = ConnectionManager.open();
        Class<Driver> driverClass = Driver.class;
        return connection;
    }
    }