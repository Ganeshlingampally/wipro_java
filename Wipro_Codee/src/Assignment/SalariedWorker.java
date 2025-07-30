package Assignment;

class SalariedWorker extends Worker {
 public SalariedWorker(String name, double salaryRate) {
     super(name, salaryRate);
 }

 @Override
 public double pay(int hours) {
     return salaryRate * 40; // fixed 40 hours
 }
}

