import java.util.*;
public class circleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        try {
            double radius = sc.nextDouble();
            double area = Math.PI * radius * radius;
            System.out.printf("The area of the circle with a radius of %.2f is %.2f.%n", radius, area);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number for the radius.");
        }
    }
}