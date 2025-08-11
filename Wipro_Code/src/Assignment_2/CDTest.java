package Assignment_2;

import java.util.*;

//CD class with Comparable interface
class CD implements Comparable<CD> {
 private String title;
 private String singer;

 public CD(String title, String singer) {
     this.title = title;
     this.singer = singer;
 }

 public String getTitle() {
     return title;
 }

 public String getSinger() {
     return singer;
 }

 // compare CDs by singer name (ascending)
 @Override
 public int compareTo(CD other) {
     return this.singer.compareToIgnoreCase(other.singer);
 }

 @Override
 public String toString() {
     return "CD [Title: " + title + ", Singer: " + singer + "]";
 }
}

//Main class to test
public class CDTest {
 public static void main(String[] args) {
     List<CD> cdList = new ArrayList<>();
     cdList.add(new CD("Shape of You", "Ed Sheeran"));
     cdList.add(new CD("Blinding Lights", "The Weeknd"));
     cdList.add(new CD("Hello", "Adele"));
     cdList.add(new CD("Thriller", "Michael Jackson"));

     System.out.println("Before Sorting:");
     for (CD cd : cdList) {
         System.out.println(cd);
     }

     // Sort using Comparable
     Collections.sort(cdList);

     System.out.println("\nAfter Sorting by Singer Name (Ascending):");
     for (CD cd : cdList) {
         System.out.println(cd);
     }
 }
}

