package pa3;
import java.util.Scanner;
public class RhymingWords {

	public static void main(String[] args) {
		System.out.println("Input 3 words of length at least 2: ");
		Scanner stdin = new Scanner(System.in);
		
		//Declare variables for our string inputs.
		String str1 = stdin.next();
		String str2 = stdin.next();
		String str3 = stdin.next();
		
		//Declare 3 substring variables to to be assigned each string's last 2 characters
		String lastTwo1 = str1.substring(str1.length()-2, str1.length());
		String lastTwo2 = str2.substring(str2.length()-2, str2.length());
		String lastTwo3 = str3.substring(str3.length()-2, str3.length());
		
		//Use ".equals" method to compare substring variables
		//Make sure everything is contained in an if-else statement
		if(lastTwo1.equals(lastTwo2)) 
		{
			if(lastTwo2.equals(lastTwo3))
			{
				System.out.println("All words rhyme"); //All substring variables equal each other
			}
			else
			{
				System.out.println(str1 + " and " + str2 + " rhyme"); //1st and 2nd string's substring variables equal each other
			}
		}
		else if(lastTwo1.equals(lastTwo3)) 
		{
			System.out.println(str1 + " and " + str3 + " rhyme"); //1st and 3rd string's substring variables equal each other
		}
		else if(lastTwo2.equals(lastTwo3)) 
		{
			System.out.println(str2 + " and " + str2 + " rhyme"); //2nd and 3rd string's substring variables equal each other
		}
		else 
		{
			System.out.println("No rhyming words"); //All substring variables do not equal each other
		}
		
		//Testing method used mid-code to check for errors
		/*
		System.out.println("3 inputs: " + str1 + " " + str2 + " "+ str3);
		System.out.println(last1 + last2 + last3); */
	}

}
