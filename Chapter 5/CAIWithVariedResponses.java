import java.security.SecureRandom;
import java.util.Scanner;

public class CAIWithVariedResponses {
    private static final SecureRandom random = new SecureRandom();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continueLearning;
        
        do {
            int[] numbers = generateQuestion();
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
    
    public static int[] generateQuestion() {
        int num1 = 1 + random.nextInt(9);
        int num2 = 1 + random.nextInt(9);
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