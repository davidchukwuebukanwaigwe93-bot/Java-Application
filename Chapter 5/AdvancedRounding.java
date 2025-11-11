import java.util.Scanner;

public class AdvancedRounding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a double value: ");
        double x = input.nextDouble();
        
        System.out.printf("Original: %f%n", x);
        System.out.printf("Rounded to integer: %d%n", Math.round(roundToInteger(x)));
        System.out.printf("Rounded to tenths: %.1f%n", roundToTenths(x));
        System.out.printf("Rounded to hundredths: %.2f%n", roundToHundredths(x));
        System.out.printf("Rounded to thousandths: %.3f%n", roundToThousandths(x));
        
        input.close();
    }
    
    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);
    }
    
    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }
    
    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }
    
    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }
}