import java.util.Scanner;

public class TemperatureConversions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Choose conversion:");
        System.out.println("1 - Fahrenheit to Celsius");
        System.out.println("2 - Celsius to Fahrenheit");
        System.out.print("Enter choice (1 or 2): ");
        int choice = input.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter Fahrenheit temperature: ");
            double fahrenheit = input.nextDouble();
            System.out.printf("Celsius equivalent: %.2f%n", celsius(fahrenheit));
        } else if (choice == 2) {
            System.out.print("Enter Celsius temperature: ");
            double celsius = input.nextDouble();
            System.out.printf("Fahrenheit equivalent: %.2f%n", fahrenheit(celsius));
        } else {
            System.out.println("Invalid choice");
        }
        
        input.close();
    }
    
    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }
    
    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }
}