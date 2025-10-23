import java.util.*;
public class BMI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in kilograms:");
        try {
            double weight = sc.nextDouble();
            System.out.println("Enter your height in meters:");
            double height = sc.nextDouble();
            double bmi = weight / (height * height);
            System.out.printf("Your BMI is %.2f.%n", bmi);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers for weight and height.");
        }
    }
}