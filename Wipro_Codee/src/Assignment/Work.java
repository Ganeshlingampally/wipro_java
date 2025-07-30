package Assignment;

class Worker {
 protected String name;
 protected double salaryRate;

 public Worker(String name, double salaryRate) {
     this.name = name;
     this.salaryRate = salaryRate;
 }

 public double pay(int hours) {
     // Will be overridden
     return 0;
 }

 public void displayPay(int hours) {
     System.out.println("Worker: " + name);
     System.out.println("Pay for " + hours + " hours: ₹" + pay(hours));
     System.out.println();
 }
}

