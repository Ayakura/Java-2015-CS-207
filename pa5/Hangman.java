package pa5;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {

		int guessLeft = 6;
		
		//Method testing
		/*String testM1 = createPartialWord("meow");
		System.out.println(testM1);
		System.out.println("The current Hangman picture is: " );
		printHangman(6);
		
		String testM2 = replaceChar("beach", 'a', 3);
		System.out.println(testM2);
		
		String testM3 = updatePartialWord("beach", "baach", 'a');
		System.out.println(testM3);*/
		
		//generate a secret word
		String secretWord = generateSecretWord();
		System.out.println(secretWord);
		
		//default dashes based on secret word
		String partialWord = createPartialWord((secretWord));
		String currentPartial = partialWord;
		
		Scanner stdin = new Scanner(System.in);
		
		//make sure CAPITALS work as well
		while (guessLeft > 0)
		{
			String guessCorrect = "false";
			
			//ask for user choice
			System.out.println("Would you like to guess the secret word or guess a character?");
			String choice = stdin.next().toLowerCase();
			
			//user chooses to guess word
			if (choice.toLowerCase().equals("word"))
			{
				System.out.println("Enter your guess: ");
				String guessWord = stdin.next().toLowerCase();
				if (guessWord.toLowerCase().equals(secretWord))
				{
					System.out.println("You won!"); //win
					System.exit(0);
				}
				else
				{
					System.out.println("You lost..."); //lose
					System.exit(0);
				}
			}
			
			//user chooses to guess char
			if (choice.toLowerCase().equals("char"))
			{
				System.out.println("Enter your guess: ");
				char guessChar = stdin.next().toLowerCase().charAt(0);
				for (int i = 0; i <= secretWord.length()-1; i++ )
				{
					if(guessChar == partialWord.charAt(i))
					{
						guessCorrect = "true";
					}
				}
				if (guessCorrect.equalsIgnoreCase("true"))
				{
					System.out.println("You guessed correctly");
				}
						currentPartial = updatePartialWord(currentPartial, secretWord, guessChar);
				
			}
			if (guessCorrect.equalsIgnoreCase("false"))
			{
				guessLeft--;
			}
			System.out.println("The current hangman picture is: ");
			printHangman(guessLeft);
			
			//current partial word and no. of guesses
			System.out.println("The current partial word is " + currentPartial);
			System.out.println("You have " + guessLeft + " guess left");
				
			//winning and losing conditions
			if (guessLeft == 0)
			{
				if (!currentPartial.toLowerCase().equals(secretWord))
				{
				printHangman(guessLeft);
				System.out.println("You lost. Please reevaluate your life");
				System.out.println("The secret word is " + secretWord);
				System.exit(0);
				}
				
				else if (currentPartial.toLowerCase().equals(secretWord))
				{
				System.out.println("You won.");
				System.out.println("The secret word is " + secretWord);
				System.exit(0);
				}
			}
			if (currentPartial.toLowerCase().equals(secretWord) && guessLeft !=0)
			{
			System.out.println("You won with guesses to spare.");
			System.out.println("The secret word is " + secretWord);
			System.exit(0);
			}
		}
	}
	
	public static String generateSecretWord() {
        String[] names = { "alone", "apple", "anode", "abuse", "angle", "amaze","adobe","amuse","avoid","peter","sound","doubt","upper","lower","layer","enter","alter","boxer","faced", "alive","adore","names","voice","water","plate","pepsi","pizza","paste","hello","sugar","money","paper","while","times", "mouth","other","agile","again","acute","arise","argue","ankle","badge","blaze","bride","chase","sense","craze","dance","false","exile","drove"};

	        String name = names[(int) (Math.random() * names.length)];
	        System.out.println("Welcome to Hangman~");
			System.out.println("I picked a secret word");
	return name;
	
	}
	
	public static String createPartialWord(String secretWord)
	{
		String lines = "";
		
		//print out dashes based on length of word
		for (int i = 0; i <= secretWord.length()-1; i++)
		{
			char c = '-';
			lines = lines + c;	
		}
		return lines;		
	}
	
	public static String replaceChar(String word, char c, int i)
	{
		if (word.length() <= i)
		{
			return word;
		}
		else {
			
		//use word split method from pigLatin
		String input = word;
		String newInput = input.substring(0,i)+ c +input.substring(i+1);
		
		
		return newInput;
		}
	}
	public static String updatePartialWord(String partial, String secret, char c)
	{
		for (int j = 0; j <= secret.length()-1; j++)
		{
			if (secret.charAt(j) == c)
			{
			partial = replaceChar(partial, c, j); // replace and assign to current partial word
			}
		}
		return partial;
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