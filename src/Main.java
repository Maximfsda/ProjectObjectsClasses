import java.util.*;

public class Main {
    public static void bookAddition(Book[] myBook, Book book) {
        for (int i = 0; i < myBook.length; i++) {
            if (myBook[i] == null) {
                myBook[i] = book;
                break;
            }
        }
    }

    public static void allPrint(Book[] myBook) {
        for (int i = 0; i < myBook.length; i++) {
            if (myBook[i] != null) {
                System.out.println(myBook[i]);
            }
        }
    }

    public static void main(String[] args) {
        Author author = new Author("Tim", "Berthon");
        Author authorOne = new Author("Slim", "Wigen");
        Book bookOne = new Book("Derma", author, 1999);
        Book bookTwo = new Book("Dermda", authorOne, 1989);

        System.out.println("Средний уровень");
        Book[] myBook = new Book[5];
        bookAddition(myBook, bookOne);
        bookAddition(myBook, bookTwo);
        allPrint(myBook);
        System.out.println("1.10. Методы объектов");
        System.out.println(bookOne);
        System.out.println(author);

        System.out.println(author.equals(authorOne));
        System.out.println(bookOne.equals(bookTwo));

        System.out.println(authorOne.hashCode());
        System.out.println(bookOne.hashCode());
    }
}