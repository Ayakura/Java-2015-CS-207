package r6;
import java.util.Scanner;
public class Disemvowel {

	public static void main(String[] args) {
	System.out.println("Enter a word: ");
	Scanner stdin = new Scanner(System.in);
	String word = stdin.next();
	
	String disemvoweledWord = "";
	int len = word.length();
	
	for (int i = 0; i < len; i++)
	{
		//Read i at one point in time 
		char ch = word.charAt(i);
		if (ch != 'a' && ch != 'i' && ch != 'u' && 
			ch != 'e' && ch != 'o')
		{
			disemvoweledWord = disemvoweledWord + ch;
		}
	}
	System.out.println(disemvoweledWord);
	}

}
