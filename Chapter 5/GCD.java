import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int a = input.nextInt();
        System.out.print("Enter second integer: ");
        int b = input.nextInt();
        
        System.out.printf("GCD of %d and %d is %d%n", a, b, gcd(a, b));
        input.close();
    }
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}