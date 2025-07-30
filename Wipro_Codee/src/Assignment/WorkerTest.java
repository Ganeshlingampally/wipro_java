package Assignment;

public class WorkerTest {
 public static void main(String[] args) {
     Worker w1 = new DailyWorker("Alice", 500);
     Worker w2 = new SalariedWorker("Bob", 600);

     w1.displayPay(30);  // For DailyWorker, based on actual hours
     w2.displayPay(30);  // For SalariedWorker, always 40 hours fixed
 }
}

