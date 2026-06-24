import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        double n1 = sc.nextDouble();

        System.out.println("Enter second number : ");
        double n2 = sc.nextDouble();

        System.out.println("\nChoose Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println(" Enter your chopice(1-4) : ");
        int choice = sc.nextInt();
        double result;
        switch (choice) {
            case 1:
                result = n1+n2;
                System.out.println(" Result : " + result);
                
                break;
             case 2:
                result = n1 - n2;
                System.out.println("Result = " + result);
                break;

            case 3:
                result = n1 * n2;
                System.out.println("Result = " + result);
                break;

            case 4:
                if (n2 != 0) {
                    result = n1 / n2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

        
            default:
                 System.out.println("Invalid Choice!");
                break;
        }
         sc.close();

    }
}
