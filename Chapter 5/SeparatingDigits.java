import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter integer (1-99999): ");
        int number = input.nextInt();
        
        displayDigits(number);
        input.close();
    }
    
    // Part a
    public static int quotient(int a, int b) {
        return a / b;
    }
    
    // Part b
    public static int remainder(int a, int b) {
        return a % b;
    }
    
    // Part c
    public static void displayDigits(int number) {
        if (number < 1 || number > 99999) {
            System.out.println("Number must be between 1 and 99999");
            return;
        }
        
        String result = "";
        int divisor = 10000;
        
        while (divisor >= 1) {
            int digit = quotient(number, divisor);
            if (digit != 0 || divisor == 1 || !result.isEmpty()) {
                result += digit + "  ";
            }
            number = remainder(number, divisor);
            divisor = quotient(divisor, 10);
        }
        
        System.out.println(result.trim());
    }
}