package r5;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
	    // ask for the last number
		System.out.println("Enter your last number (>=3): ");
		Scanner stdin = new Scanner(System.in);
		int lastNumber = stdin.nextInt();
		
		System.out.println("Primes: ");
		int number = 2;
		int counter = 0;
		while (number <= lastNumber)
		{
			// test if the number is a prime
			int denominator = 2;
			boolean divisible = false;
			for (denominator = 2; denominator <= number/2 && !divisible; denominator++)
			{
				//System.out.println("denominator = " + denominator);
				if (number%denominator == 0)
				{
					//System.out.println("divisible by " + denominator);
					divisible = true;
				}
			}
			
			if (!divisible)
			{
				if (counter % 10 == 0)
				{
					System.out.println();
				}
				
				System.out.print(number + " ");

				counter++;
			}
			//else
			//{
			//	System.out.println(number + " is NOT a prime");
			//}
			
			number++;
		}
	}
}