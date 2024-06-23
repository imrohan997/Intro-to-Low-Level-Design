package double_locking;

public class DBConnection {
    private static DBConnection connObj;

    private DBConnection() {

    }

    public static DBConnection getInstance() {
        if (connObj == null) {
            synchronized (DBConnection.class) {
                if(connObj == null) {
                    connObj = new DBConnection();
                }
            }
        }
        return connObj;
    }
}
