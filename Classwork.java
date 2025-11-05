import java.util.Scanner;

public class Classwork{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = 0;
		int zero;
		int positive;
		int negative;
		
		while(true){
			
			System.out.print("Enter number or -1 to quit");
			num = input.nextInt();
			
			if(num == 0){
				zero += 1;
			}
			else if(num < 0){
				neg += 1;
			}
			else if(num > 0){
				pos += 1;
			}
		}
		System.out.printf("The total number of negative numbers = %d . Zero = %d . Positive = %d",neg,zero,pos);
	}
}