import java.security.SecureRandom;
import java.util.Scanner;

public class CAIWithDifficultyLevels {
    private static final SecureRandom random = new SecureRandom();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continueLearning;
        
        System.out.print("Enter difficulty level (1-4): ");
        int difficultyLevel = input.nextInt();
        
        do {
            int[] numbers = generateQuestion(difficultyLevel);
            int correctAnswer = numbers[0] * numbers[1];
            int studentAnswer;
            
            do {
                System.out.printf("How much is %d times %d? ", numbers[0], numbers[1]);
                studentAnswer = input.nextInt();
                
                if (studentAnswer == correctAnswer) {
                    displayCorrectResponse();
                } else {
                    displayIncorrectResponse();
                }
            } while (studentAnswer != correctAnswer);
            
            System.out.print("Continue learning? (yes/no): ");
            continueLearning = input.next();
            
        } while (continueLearning.equalsIgnoreCase("yes"));
        
        input.close();
    }
    
    public static int[] generateQuestion(int difficultyLevel) {
        int maxNumber;
        
        switch (difficultyLevel) {
            case 1: maxNumber = 9; break;    // Single-digit numbers
            case 2: maxNumber = 99; break;   // Two-digit numbers  
            case 3: maxNumber = 999; break;  // Three-digit numbers
            case 4: maxNumber = 9999; break; // Four-digit numbers
            default: maxNumber = 9; break;   // Default to level 1
        }
        
        int num1 = 1 + random.nextInt(maxNumber);
        int num2 = 1 + random.nextInt(maxNumber);
        return new int[]{num1, num2};
    }
    
    public static void displayCorrectResponse() {
        int response = 1 + random.nextInt(4);
        
        switch (response) {
            case 1: System.out.println("Very good!"); break;
            case 2: System.out.println("Excellent!"); break;
            case 3: System.out.println("Nice work!"); break;
            case 4: System.out.println("Keep up the good work!"); break;
        }
    }
    
    public static void displayIncorrectResponse() {
        int response = 1 + random.nextInt(4);
        
        switch (response) {
            case 1: System.out.println("No. Please try again."); break;
            case 2: System.out.println("Wrong. Try once more."); break;
            case 3: System.out.println("Don't give up! No."); break;
            case 4: System.out.println("Keep trying."); break;
        }
    }
}