import java.util.Scanner;

public class Runner {
	
	public static void main(String [] args)  {
	
		int numberBits = 10;
		int bite = 8;
		int nibble = 4;
		int byteAnswer = 0, byteRemainder = 0;
		
		byteAnswer = numberBits / bite;
		byteRemainder = numberBits % bite;
		
		System.out.println("bits = " + numberBits + " bytes = " + byteAnswer + " remainder = " + byteRemainder);
		
		
		Scanner kbd = new Scanner(System.in);
		System.out.println("Hello, enter your answer (Y/N)");
		String answer = kbd.nextLine().toUpperCase();
		System.out.println("You have entered: " + answer);
		
		if(answer.equals ("Y") || answer.equals("YES")) {
			System.out.println("You have selected YES!");
		
		} else if(answer.equals ("N") || answer.equals("NO")) {
			System.out.println("You have selected NO!");
		
		} else {
			System.out.println("I am un familiar with the term you have used, pls try agane");
		}
	
	}
}
