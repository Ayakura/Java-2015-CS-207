package r5;
import java.util.Scanner;
public class DivisibleByNine {

	public static void main(String[] args) {
		System.out.println("Input 2 integers: ");
		Scanner stdin = new Scanner(System.in);
		
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		
		while(a<b) 
		{
			if(a%9 == 0) 
			{
				System.out.println(a);
			}
			a++;
		}
	}

}
