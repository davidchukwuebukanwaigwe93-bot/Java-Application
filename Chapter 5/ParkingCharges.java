import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0.0;
        double hoursParked;

        System.out.print("Enter hours parked for customer (or -1 to quit): ");
        hoursParked = input.nextDouble();

        while (hoursParked != -1) {
            double charge = calculateCharges(hoursParked);
            totalReceipts += charge;
            System.out.printf("Current customer charge: $%.2f%n", charge);
            System.out.printf("Running total receipts: $%.2f%n", totalReceipts);
            System.out.print("Enter hours parked for next customer (or -1 to quit): ");
            hoursParked = input.nextDouble();
        }
        
        input.close();
    }

    public static double calculateCharges(double hours) {
        double minimumFee = 2.00;
        double maximumFee = 10.00;
        double hourlyRate = 0.50;
        int minimumHours = 3;
        
        if (hours <= minimumHours) {
            return minimumFee;
        } else {
            double charge = minimumFee + Math.ceil(hours - minimumHours) * hourlyRate;
            return Math.min(charge, maximumFee);
        }
    }
}