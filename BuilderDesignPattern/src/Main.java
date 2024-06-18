import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder();
        Student student = studentBuilder
                .setAge(26)
                .setName("Rohan Agarwal")
                .setRollNo(26)
                .setFatherName("Vishnu Aggarwal")
                .setMotherName("Sangeeta Aggarwal")
                .setSubjects(List.of("Data Structures", "Algorithm Design and Analysis", "Operating Systems", "Computer Architecture"))
                .build();
        System.out.println(student);
    }
}