package Assignment;

import java.util.*;

//CD class implementing Comparable to sort based on singer name
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

 // Compare based on singer name
 @Override
 public int compareTo(CD other) {
     return this.singer.compareToIgnoreCase(other.singer);
 }

 @Override
 public String toString() {
     return "CD [Title=" + title + ", Singer=" + singer + "]";
 }

 public static void main(String[] args) {
     List<CD> cds = new ArrayList<>();
     cds.add(new CD("Melody Hits", "Arijit Singh"));
     cds.add(new CD("Rock Legends", "KK"));
     cds.add(new CD("Love Songs", "Shreya Ghoshal"));
     cds.add(new CD("Party Mix", "Neha Kakkar"));

     // Sorting based on singer name
     Collections.sort(cds);

     System.out.println("CDs sorted by singer name:");
     for (CD cd : cds) {
         System.out.println(cd);
     }
 }

 /*
 ---------- Output ----------
 CDs sorted by singer name:
 CD [Title=Melody Hits, Singer=Arijit Singh]
 CD [Title=Rock Legends, Singer=KK]
 CD [Title=Party Mix, Singer=Neha Kakkar]
 CD [Title=Love Songs, Singer=Shreya Ghoshal]
 ----------------------------
 */
}

