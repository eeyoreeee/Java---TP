import java.util.*;
public class nameAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        try {
            int age= sc.nextInt();
            System.out.println("Hello " + name + ", you are " + age + " years old.");
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input for age. Please enter a valid integer.");
        }

    }
}