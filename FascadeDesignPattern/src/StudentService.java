public class StudentService {

    StudentDAO studentDAO;

    public StudentService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public void insert() {
        studentDAO.create();
    }

    public void update() {
        studentDAO.update();
    }
}
