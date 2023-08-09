import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Please enter a number");
	
	int factorial = 1;
	int number = scanner.nextInt();
	
	for(int i = 1; i <= number; i++) {
		factorial*= i;
		
	}
	System.out.println("Factorial = " + factorial);
	
	
	
	
		
	

	}

}
