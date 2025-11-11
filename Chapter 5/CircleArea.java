import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter circle radius: ");
        double radius = input.nextDouble();
        
        System.out.printf("Circle area: %.2f%n", circleArea(radius));
        input.close();
    }
    
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}