import java.util.List;

public class Student {

    private int rollNo;
    private int age;
    private String name;
    private String fatherName;
    private String motherName;
    private List<String> subjects;


    public Student(StudentBuilder studentBuilder) {
        this.rollNo = studentBuilder.rollNo;
        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
        this.fatherName = studentBuilder.fatherName;
        this.motherName =  studentBuilder.motherName;
        this.subjects = studentBuilder.subjects;
    }

    @Override
    public String toString() {
        return "Student = [Name = " + this.name + ", Age = " + this.age + ", Roll No = " + this.rollNo
                + ", fatherName = " + this.fatherName + ", motherName = " + motherName + ", Subjects = "
                + this.subjects;
    }
}
