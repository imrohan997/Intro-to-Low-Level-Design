import prototype.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Rohan", 26, 12345);
        Student student2 = (Student) student1.clone();
        System.out.println(student1);
        System.out.println(student2);
    }
}