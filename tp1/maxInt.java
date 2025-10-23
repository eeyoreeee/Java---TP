import java.util.*; 
public class maxInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        try {
            int num1 = sc.nextInt();
            System.out.println("Enter the second integer:");
            int num2 = sc.nextInt();
            System.out.println("Ebter the third integer:");
            int num3 = sc.nextInt();
            if (num1 > num2 && num1 > num3) {
                System.out.println("The maximum of " + num1 + ", " + num2 + ", and " + num3 + " is " + num1 + ".");
                return;
            }
            if (num2 > num1 && num2 > num3) {
                System.out.println("The maximum of " + num1 + ", " + num2 + ", and " + num3 + " is " + num2 + ".");
                return;
            }
            int max = num3; 
            System.out.println("The maximum of " + num1 + ", " + num2 + ", and " + num3 + " is " + max + ".");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}
