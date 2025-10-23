import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        try {
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Invalid input. Please enter a positive integer.");
                return;
            }
            int a = 0, b = 1;
            System.out.print("Fibonacci series up to " + n + ": ");
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid positive integer.");
        }
    }
}