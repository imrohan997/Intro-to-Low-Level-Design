package synchronised;

public class DBConnection {

    private static DBConnection connObj;

    private DBConnection() {

    }

    public static synchronized DBConnection getInstance() {
        if (connObj == null) {
            connObj = new DBConnection();
        }
        return connObj;
    }
}
