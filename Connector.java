import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    Connection connection = null;

    // database connection method
    public Connection connect() {
        String url = "jdbc:mysql://localhost:3306/classschedulerdb";
        String username = "root";
        String password = "";
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database successfully!");
        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
            e.printStackTrace();
        }
        return connection;
    }

    // method to test database connection
    public static void main(String[] args) {
        Connector connector = new Connector();
        connector.connect();
    }
}
