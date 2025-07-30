package Assignment;

public class Calculator {

    public void add(double a, double b) {
        double result = a + b;
        System.out.println("Addition: " + result);
    }

    public void diff(double a, double b) {
        double result = a - b;
        System.out.println("Difference: " + result);
    }

    public void mul(double a, double b) {
        double result = a * b;
        System.out.println("Multiplication: " + result);
    }

    public void div(double a, double b) {
        if (b != 0) {
            double result = a / b;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double num1 = 20.0;
        double num2 = 10.0;

        calc.add(num1, num2);
        calc.diff(num1, num2);
        calc.mul(num1, num2);
        calc.div(num1, num2);
    }
}

