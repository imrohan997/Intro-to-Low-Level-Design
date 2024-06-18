import java.util.List;

public class StudentBuilder {
    int rollNo;
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> subjects;


    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public StudentBuilder setSubjects(List<String> subjects) {
        this.subjects = subjects;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}
