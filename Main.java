import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book<Integer> book1 = new Book<>(1984);
        Book<String> book2 = new Book<>("100 лет одиночества");
        Book<String> book3 = new Book<>("Война и мир");
        Book<String> book4 = new Book<>("11/22/1963");
        Book<String> book5 = new Book<>("Двадцать тысяч лье под водой");
        Book<String> book6 = new Book<>("100 дней до приказа");

        List <Book> booksList = new ArrayList<>();
        // List <Book> givenBooksList = new ArrayList<>();

        Library <Book> library = new Library<>();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
 
        library.giveBook(book1);
        library.giveBook(book4);
        library.giveBook(book5);

        library.showGivenBooks();
        library.showRemainedBooks();
    }
}
