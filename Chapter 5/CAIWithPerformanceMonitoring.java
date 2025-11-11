import java.security.SecureRandom;
import java.util.Scanner;

public class CAIWithPerformanceMonitoring {
    private static final SecureRandom random = new SecureRandom();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String anotherStudent;
        
        do {
            int correctCount = 0;
            int totalQuestions = 10;
            
            for (int i = 1; i <= totalQuestions; i++) {
                int[] numbers = generateQuestion();
                int correctAnswer = numbers[0] * numbers[1];
                int studentAnswer;
                
                System.out.printf("Question %d: How much is %d times %d? ", i, numbers[0], numbers[1]);
                studentAnswer = input.nextInt();
                
                if (studentAnswer == correctAnswer) {
                    displayCorrectResponse();
                    correctCount++;
                } else {
                    displayIncorrectResponse();
                }
            }
            
            // Calculate percentage
            double percentage = (double) correctCount / totalQuestions * 100;
            System.out.printf("%nYou got %d out of %d correct (%.1f%%)%n", 
                            correctCount, totalQuestions, percentage);
            
            // Provide feedback based on performance
            if (percentage < 75) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
            
            System.out.print("\nAnother student? (yes/no): ");
            anotherStudent = input.next();
            
        } while (anotherStudent.equalsIgnoreCase("yes"));
        
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