import java.util.Scanner;
import java.security.SecureRandom;

enum Coin { HEADS, TAILS }

public class CoinTossing {
    private static int headsCount = 0;
    private static int tailsCount = 0;
    private static final SecureRandom random = new SecureRandom();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("1. Toss Coin");
            System.out.println("2. Display Results");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    Coin result = flip();
                    if (result == Coin.HEADS) {
                        headsCount++;
                        System.out.println("HEADS");
                    } else {
                        tailsCount++;
                        System.out.println("TAILS");
                    }
                    break;
                case 2:
                    displayResults();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
        
        input.close();
    }
    
    public static Coin flip() {
        return random.nextBoolean() ? Coin.HEADS : Coin.TAILS;
    }
    
    public static void displayResults() {
        System.out.printf("Heads: %d, Tails: %d%n", headsCount, tailsCount);
    }
}