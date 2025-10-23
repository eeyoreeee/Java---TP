import java.util.*;
public class sumtonWhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("This program calculates the sum of integers from 1 to n.");
        System.out.println("Enter a positive integer n:");
        try {
           int n = sc.nextInt();
            if (n < 1) {
                System.out.println("Please enter a positive integer greater than 0.");
                return;
            }
            int i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            System.out.println("The sum of integers from 1 to " + n + " is " + sum + ".");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid positive integer.");
        }
    }
}