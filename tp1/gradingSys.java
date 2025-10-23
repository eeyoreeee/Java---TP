import java.util.*;
public class gradingSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score (0-20):");
        try {
            double score = sc.nextDouble();
            if (score < 0 || score > 20) {
                System.out.println("Invalid input. Please enter a score between 0 and 20.");
            } else if (score >= 16) {
                System.out.println("Grade: A");
            } else if (score >= 14) {
                System.out.println("Grade: B");
            } else if (score >= 12) {
                System.out.println("Grade: C");
            } else if (score >= 10) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number for the score.");
        }
    }
}
