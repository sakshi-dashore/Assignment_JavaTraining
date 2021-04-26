package DbUtil;

import java.sql.*;


public class DbUtil {

    private static DbUtil instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3307/demo";
    private String username = "root";
    private String password = "root";

    private DbUtil() throws SQLException {
    	System.out.println("driver");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public Connection getConnection() {
    	System.out.println("connection establish");
        return connection;
    }

    public static DbUtil getInstance() throws SQLException {
        if (instance == null) {
            instance = new DbUtil();
        } else if (instance.getConnection().isClosed()) {
            instance = new DbUtil();
        }

        return instance;
    }
}

