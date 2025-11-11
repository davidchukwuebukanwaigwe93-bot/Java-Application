import java.security.SecureRandom;
import java.util.Scanner;

public class CAI {
    private static final SecureRandom random = new SecureRandom();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continueLearning;
        
        do {
            // Generate first question
            int[] numbers = generateQuestion();
            int correctAnswer = numbers[0] * numbers[1];
            int studentAnswer;
            
            // Keep asking same question until correct
            do {
                System.out.printf("How much is %d times %d? ", numbers[0], numbers[1]);
                studentAnswer = input.nextInt();
                
                if (studentAnswer == correctAnswer) {
                    System.out.println("Very good!");
                } else {
                    System.out.println("No. Please try again.");
                }
            } while (studentAnswer != correctAnswer);
            
            System.out.print("Continue learning? (yes/no): ");
            continueLearning = input.next();
            
        } while (continueLearning.equalsIgnoreCase("yes"));
        
        input.close();
    }
    
    public static int[] generateQuestion() {
        int num1 = 1 + random.nextInt(9); // 1-9
        int num2 = 1 + random.nextInt(9); // 1-9
        return new int[]{num1, num2};
    }
}