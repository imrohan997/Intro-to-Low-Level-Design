import java.util.ArrayList;

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
    }
}