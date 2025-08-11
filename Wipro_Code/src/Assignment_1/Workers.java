package Assignment_1;
public class Workers {

    // Base class
    static class Worker {
        String name;
        double salaryRate;

        Worker(String name, double salaryRate) {
            this.name = name;
            this.salaryRate = salaryRate;
        }

        double pay(int hours) {
            return 0; // To be overridden
        }
    }

    // DailyWorker subclass
    static class DailyWorker extends Worker {
        DailyWorker(String name, double salaryRate) {
            super(name, salaryRate);
        }

        @Override
        double pay(int hours) {
            int days = hours / 8;
            return days * salaryRate;
        }
    }

    // SalariedWorker subclass
    static class SalariedWorker extends Worker {
        SalariedWorker(String name, double salaryRate) {
            super(name, salaryRate);
        }

        @Override
        double pay(int hours) {
            return 40 * salaryRate; // Always paid for 40 hours
        }
    }

    // Main method to test
    public static void main(String[] args) {
        DailyWorker daily = new DailyWorker("Ajay", 500);
        SalariedWorker salaried = new SalariedWorker("Anita", 200);

        System.out.println("Daily Worker Pay for Ravi: ₹" + daily.pay(32));     // 4 days * 500 = 2000
        System.out.println("Salaried Worker Pay for Anita: ₹" + salaried.pay(50)); // 40 * 200 = 8000
    }
}

