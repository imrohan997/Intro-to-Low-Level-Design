//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Directory parentDirectory = new Directory();
        File file1 = new File();
        parentDirectory.add(file1);

        Directory childDirectory = new Directory();
        File file2 = new File();
        childDirectory.add(file2);

        parentDirectory.add(childDirectory);

        parentDirectory.ls();

    }
}