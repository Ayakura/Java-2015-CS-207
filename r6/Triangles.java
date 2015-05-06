package r6;
import java.util.Scanner;
public class Triangles {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter number of columns: ");
		int col = stdin.nextInt();
		
		//System.out.println("Enter number of rows: ");
		//int row = stdin.nextInt();
		
		//if enter even number, the amount of col will be col + 1
		System.out.println("Enter your symbol: ");
		String sym = stdin.next();
		
		//counter i for number of columns, k for printing sym, j for spaces
		for (int i = 1; i < col + 1; i += 1) // i+=1 and col + 1 if printing right side of triangle, 2 for both
		{
		    //this is to print the spaces 
		    //on the two sides. Change col/2 to something else if needs more 
			for (int j = 0; j < (col/2 - i / 2); j++)
		    {
		        System.out.print(""); // ("") if printing right side of triangle, (" ") for both
		    }
		    for (int k = 0; k < i; k++) //print out symbols 
		    {
		        System.out.print(sym.charAt(0));
		    }
		    System.out.println("");
		}
			
	}

}