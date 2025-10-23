import java.util.*;
public class sumtonFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer n to calculate the sum from 1 to n:");
        try {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("The sum of integers from 1 to " + n + " is " + sum + ".");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid positive integer.");
        }
    }
}