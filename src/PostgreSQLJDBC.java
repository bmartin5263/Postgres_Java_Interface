import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreSQLJDBC {

    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "postgres";
    private static final String DATABASE = "postgres";
    private static final String URL = String.format("jdbc:postgresql://localhost:5432/%s", DATABASE);

    static {
        System.out.println("Hello World!");
    }

    public static void main(String args[]) {

        Connection c = null;

        try {
            c = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("Opened database successfully");
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
    }
}