import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "Data Structures"));
        books.add(new Book(2, "Algorithm Design"));
        books.add(new Book(3, "Operating Systems"));
        books.add(new Book(4, "Databases"));
        books.add(new Book(5, "Computer Networks"));

        Library<Book> bookList = new Library<>(books);
        Iterator<Book> iterator = bookList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().bookName);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("---------------");

        Library<Integer> numbersList = new Library<>(numbers);
        Iterator<Integer> integerIterator = numbersList.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }
    }
}