import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

         System.out.println("\nMultiplication Table of " + n);
       
        for(int i = 1; i<=10; i++){
        System.out.println( n*i);
        }
       sc.close();
    }
}
