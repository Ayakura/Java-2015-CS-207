package r6;
import java.util.Scanner;
public class SumOfDivisibleBySeven {
	
	public static void main(String[] args) {
		System.out.println("Enter 1st integer: ");
		Scanner stdin = new Scanner(System.in);
		int firstInt = stdin.nextInt();
		
		System.out.println("Enter 2nd integer: ");
		int secondInt = stdin.nextInt();
		
		int sum = 0;
		for(int i = firstInt; i <= secondInt ; i++)
		{
			if (i%7 == 0)
			{
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
