package br.com.javacore.zzcjdbc.conn;

import jdk.nashorn.internal.runtime.regexp.JdkRegExp;

import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class ConexaoFactory {

    public static Connection getConexao() {
        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false&allowPublicKeyRetrieval=true";
        String user = "root";
        String password = "senha2020";

        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static JdbcRowSet getRowSetConnection() {
        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false&allowPublicKeyRetrieval=true";
        String user = "root";
        String password = "senha2020";

        try {
            JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRowSet.setUrl(url);
            jdbcRowSet.setUsername(user);
            jdbcRowSet.setPassword(password);
            return jdbcRowSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static CachedRowSet getCachedRowSetConnection() {
        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false&allowPublicKeyRetrieval=true";
        String user = "root";
        String password = "senha2020";

        try {
            CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
            crs.setUrl(url);
            crs.setUsername(user);
            crs.setPassword(password);
            return crs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection connection) {
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection connection, Statement statement) {
        close(connection);
        try {
            if (statement != null)
                statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection connection, Statement statement, ResultSet resultSet) {
        close(connection, statement);
        try {
            if(resultSet != null)
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(RowSet rowSet) {
        try {
            if (rowSet != null)
            rowSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
