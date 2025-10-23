import java.util.*;
public class triangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lengths of the three sides of the triangle:");
        try {
            double side1 = sc.nextDouble();
            double side2 = sc.nextDouble();
            double side3 = sc.nextDouble();
        if(side1 <= 0 || side2 <= 0 || side3 <= 0) {
        System.out.println("Side lengths must be positive numbers.");} 
        else if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            System.out.println("The lengths can form a valid triangle.");
        } else {
            System.out.println("The lengths cannot form a valid triangle.");
        }
        if(side1 == side2 && side2 == side3) {
            System.out.println("The triangle is equilateral.");
        } else if(side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");}
        }catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers for the side lengths.");
        }
            }
}
