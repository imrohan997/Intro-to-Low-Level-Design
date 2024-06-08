public class EmployeeDaoImpl implements EmployeeDao{


    @Override
    public void create(String client) {
        System.out.println("Created new row in employee table");
    }

    @Override
    public void delete(String client, String employeeId) {
        System.out.println("Deleted row with employeeId : " + employeeId);
    }

    @Override
    public void get(String client, String employeeId) {
        System.out.println("Fetching data with employeeId : " + employeeId + " from db");
    }
}
