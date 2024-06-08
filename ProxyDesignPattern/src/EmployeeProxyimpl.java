public class EmployeeProxyimpl implements EmployeeDao{

    EmployeeDaoImpl employeeDao;

    public EmployeeProxyimpl() {
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client) throws Exception {
        if(client.equalsIgnoreCase("ADMIN")) {
            employeeDao.create(client);
        } else {
            throw new Exception("access denied");
        }
    }

    @Override
    public void delete(String client, String employeeId) throws Exception {
        if(client.equalsIgnoreCase("ADMIN")) {
            employeeDao.delete(client, employeeId);
        } else {
            throw new Exception("access denied");
        }
    }

    @Override
    public void get(String client, String employeeId) throws Exception {
        if(client.equalsIgnoreCase("ADMIN") || client.equalsIgnoreCase("USER")) {
            employeeDao.get(client, employeeId);
        } else {
            throw new Exception("access denied");
        }
    }
}
