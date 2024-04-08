package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.util.ConnectionManager;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
//В класс Util должна быть добавлена конфигурация для Hibernate ( рядом с JDBC), без использования xml.

public final class Util {

    public static Connection getConnection() {

        Connection connection = ConnectionManager.open();
        Class<Driver> driverClass = Driver.class;
        return connection;
    }
    public static SessionFactory getSessionFactory() {
        return new Configuration().addAnnotatedClass(User.class).buildSessionFactory();
    }
}