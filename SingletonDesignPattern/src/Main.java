import eager.DBConnection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection1 = DBConnection.getInstance();
        System.out.println(dbConnection1);

        DBConnection dbConnection2 = DBConnection.getInstance();
        System.out.println(dbConnection2);

        Thread thread1 = new Thread(() -> {
            lazy.DBConnection dbConnection3 = null;
            try {
                dbConnection3 = lazy.DBConnection.getInstance();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(dbConnection3);
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            lazy.DBConnection dbConnection4 = null;
            try {
                dbConnection4 = lazy.DBConnection.getInstance();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(dbConnection4);
        });
        thread2.start();


        synchronised.DBConnection dbConnection5 = synchronised.DBConnection.getInstance();
        System.out.println(dbConnection5);


        synchronised.DBConnection dbConnection6 = synchronised.DBConnection.getInstance();
        System.out.println(dbConnection6);


        double_locking.DBConnection dbConnection7 = double_locking.DBConnection.getInstance();
        System.out.println(dbConnection7);


        double_locking.DBConnection dbConnection8 = double_locking.DBConnection.getInstance();
        System.out.println(dbConnection8);
    }
}