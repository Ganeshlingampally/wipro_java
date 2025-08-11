package Assignment_2;

import java.util.*;

class BookStore {
 private int bookId;
 private String bookName;

 public BookStore(int bookId, String bookName) {
     this.bookId = bookId;
     this.bookName = bookName;
 }

 public int getBookId() {
     return bookId;
 }

 public String getBookName() {
     return bookName;
 }

 @Override
 public String toString() {
     return "BookStore [BookID: " + bookId + ", BookName: " + bookName + "]";
 }
}

class BookNameComparator implements Comparator<BookStore> {
 public int compare(BookStore b1, BookStore b2) {
     return b1.getBookName().compareToIgnoreCase(b2.getBookName());
 }
}

class BookIdComparator implements Comparator<BookStore> {
 public int compare(BookStore b1, BookStore b2) {
     return Integer.compare(b1.getBookId(), b2.getBookId());
 }
}

public class BookStoreTest {
 public static void main(String[] args) {
     List<BookStore> books = new ArrayList<>();
     books.add(new BookStore(102, "The Alchemist"));
     books.add(new BookStore(101, "Java Programming"));
     books.add(new BookStore(105, "C Programming"));
     books.add(new BookStore(103, "Algorithms"));

     System.out.println("Original List:");
     for (BookStore b : books) {
         System.out.println(b);
     }

     Collections.sort(books, new BookNameComparator());
     System.out.println("\nSorted by Book Name:");
     for (BookStore b : books) {
         System.out.println(b);
     }

     Collections.sort(books, new BookIdComparator());
     System.out.println("\nSorted by Book ID:");
     for (BookStore b : books) {
         System.out.println(b);
     }
 }
}

