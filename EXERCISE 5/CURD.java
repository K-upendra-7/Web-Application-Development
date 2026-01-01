// import is madatory to use the classes
import java.sql.Connection;
import java.sql.DriverManager;

public class CURD {
    public static void main(String[] args) {
        System.out.println("CURD Operations");

        // Database Connection
        String URL = "jdbc:oracle:thin:@localhost:1521:xe";
        String USER = "upendra";
        String PASSWORD = "123456";

        try {
            // Load the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish the connection
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection Established");

            // Close the connection
            conn.close();            
        } catch (Exception e) {
            // Handle any exceptions that may occur
            System.out.println(e.getMessage());
        }
    }
} 
