package r9;
import java.util.*;
public class NumberHangman {

	public static void main(String[] args) {
		int guessLeft = 6;
		
		Random r = new Random();
		int secretNumber = r.nextInt(100);
		
		//for test purposes
		System.out.println(secretNumber);
		
		while (guessLeft > 0)
		{
			System.out.println("You have " + guessLeft + " guesses left");
			printHangman(guessLeft);
			System.out.println("Enter your guess fgt: ");
			Scanner stdin = new Scanner(System.in);
			int guess = stdin.nextInt();
			if (guess == secretNumber) 
			{
				System.out.println("A winner is you.");
				System.exit(0);
			}
			
			else if (guess < secretNumber)
			{
				System.out.println("the secret number is larger");	
			}
			else if (guess > secretNumber)
			{
				System.out.println("the secret number is smaller");
			}
			guessLeft--;
			if (guessLeft == 0)
			{
				printHangman(guessLeft);
				System.out.println("You just lost the most basic game ever. End yourself");
				System.out.println("The secret number is " + secretNumber);
			}
		}
		
	}

	public static void printHangman(int guessLeft) {
		String HEAD = " ";
		String BODY = " ";
		String LEGS = " ";
		String LEFTARM = " ";
		String RIGHTARM = " ";
		System.out.println("_____");
		System.out.println("|   |");
		if (guessLeft < 6) {
			HEAD = "()";
		}
		System.out.println("|   " + HEAD);
		if (guessLeft < 5) {
			BODY = "||";
		}
		if (guessLeft < 4) {
			LEFTARM = "\\";
		}
		if (guessLeft < 3) {
			RIGHTARM = "/";
		}
		System.out.println("|  " + LEFTARM + BODY + RIGHTARM);
		if (guessLeft < 2) {
			LEGS = "/";
		}
		if (guessLeft < 1) {
			LEGS += "\\";
		}
		System.out.println("|   " + LEGS);
		System.out.println("|_____\n\n\n\n");
	}

}

















