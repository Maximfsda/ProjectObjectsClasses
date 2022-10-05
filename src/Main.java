import java.util.*;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Tim", "Berthon");
        Author authorOne = new Author("Slim", "Wigen");
        Book bookOne = new Book("Derma", author, 1999);
        Book bookTwo = new Book("Desrma", authorOne, 1929);
        bookOne.setYearPublication(2005);
        bookTwo.setYearPublication(2000);

        System.out.println("Средний уровень");
        Book[] myBook = new Book[5];
        bookAddition(myBook, bookOne);
        bookAddition(myBook, bookTwo);
        allPrint(myBook);
    }

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
}