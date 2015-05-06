package r5;
import java.util.Scanner;
public class NumberOfChars {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Input a list of words that ends with \"quit\" ");
	
		String currentWord = stdin.next();
		
		int totalChar = 0;
		int counter = 0;
		
		while(!currentWord.equals("quit"))
		{
			int num = currentWord.length();
			totalChar = totalChar + num;
			currentWord = stdin.next();
			counter++;
		}
		System.out.println(totalChar / (counter *1.0));
	}

}
