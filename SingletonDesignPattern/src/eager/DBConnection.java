package eager;

public class DBConnection {


    private static DBConnection connObj = new DBConnection();

    private DBConnection() {

    }

    public static DBConnection getInstance() {
        return connObj;
    }
}
