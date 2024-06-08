public interface EmployeeDao {
    void create(String client) throws Exception;
    void delete(String client, String employeeId) throws Exception;
    void get(String client, String employeeId) throws Exception;
}
