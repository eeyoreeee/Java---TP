import java.util.*;
public class IntegersSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        try {
            int num1 = sc.nextInt();
            System.out.println("Enter the second integer:");
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}