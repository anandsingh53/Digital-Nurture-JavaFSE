import java.util.Scanner;

public class GraadeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print(" Enter your marks : ");
        int n = sc.nextInt();

    if (n>89) {
        System.out.println(" Grade A ");
        
    }if (n>79) {
        System.out.println("Grade B ");
    }if (n>69) {
        System.out.println("Grade C ");
    }if (n>59) {
        System.out.println(" Grade D ");
    }else{
        System.out.println("Grade F");
    }

    }
    
}
