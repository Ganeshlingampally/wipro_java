package Assignment_2;
import java.util.Scanner;

@FunctionalInterface
interface MinimumFind {
    float findMin(float a, float b, float c);
}

public class MinApp {

    public static float minimum3(float a, float b, float c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();

        System.out.print("Enter third number: ");
        float num3 = sc.nextFloat();

       
        MinimumFind minFinder = (a, b, c) -> MinApp.minimum3(a, b, c);

        float result = minFinder.findMin(num1, num2, num3);

        System.out.println("The smallest number is: " + result);
    }
}
