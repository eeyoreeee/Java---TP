import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non-negative integer to compute its factorial:");
        try {
            int number = sc.nextInt();
            if (number < 0) {
                System.out.println("Invalid input. Please enter a non-negative integer.");
            } else {
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                System.out.println("The factorial of " + number + " is " + factorial + ".");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid non-negative integer.");
        }
    }
}