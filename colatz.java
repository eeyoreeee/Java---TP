import java.util.*;
public class colatz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        try {
            int number = sc.nextInt();
            if (number <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }
            System.out.print("Collatz sequence: " + number);
            while (number != 1) {
                if (number % 2 == 0) {
                    number /= 2;
                } else {
                    number = 3 * number + 1;
                }
                System.out.print(" -> " + number);
            }
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid positive integer.");
        }
    }
}