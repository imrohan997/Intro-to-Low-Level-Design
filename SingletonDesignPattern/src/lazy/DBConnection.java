package lazy;

public class DBConnection {

    private static DBConnection connObj;

    private DBConnection() {

    }

    public static DBConnection getInstance() throws InterruptedException {
        if(connObj == null) {
            connObj = new DBConnection();
        }
        return connObj;
    }
}
