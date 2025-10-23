import java.util.*;
public class CtoF{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius:");
        try {
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.%n", celsius, fahrenheit);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number for temperature.");
        }
    }
}