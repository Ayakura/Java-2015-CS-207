package r3;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		
		int intNumber = stdin.nextInt(); //input mismatch if enter double
		System.out.println("You entered the integer: " + intNumber);
		
		System.out.println("Enter any number"); //enter anything except string
		double number = stdin.nextDouble();
		System.out.println("You entered the number: " + number);
		
		System.out.println("Type two words: "); //enter string
		String firstWord = stdin.next();
		String secondWord = stdin.next();
		System.out.print("The words you typed are: ");
		System.out.println(firstWord+ " " + secondWord);
	}

}
