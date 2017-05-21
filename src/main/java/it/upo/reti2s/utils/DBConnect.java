package it.upo.reti2s.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Get a connection to the SQLite database that stores our tasks.
 *
 * @author <a href="mailto:luigi.derussis@uniupo.it">Luigi De Russis</a>
 * @version 1.0 (28/04/2017)
 */
public class DBConnect {
    static private final String dbLoc = "jdbc:sqlite:src/main/resources/tasks.db";
    static private DBConnect instance = null;

    private DBConnect() {
        instance = this;
    }

    public static DBConnect getInstance() {
        if (instance == null)
            return new DBConnect();
        else {
            return instance;
        }
    }

    public Connection getConnection() throws SQLException {
        try {

            Connection conn = DriverManager.getConnection(dbLoc);
            return conn;

        } catch (SQLException e) {
            throw new SQLException("Cannot get connection to " + dbLoc, e);
        }
    }

}
