package pa4;
import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		//Part 1: Output decreasing odd integers 
		System.out.print("Part 1: ");
		for (int i = 87; i >= 45; i--)
		{
			if (i%2==1)
			{
			System.out.print(i + " ");
			}
		}
		System.out.println("");
		
		//Part 2: Output sum of squares of integers
		int sum = 0;
		System.out.print("Part 2: ");
		for(int j = 4; j <=15; j++)
		{
			sum = sum + j*j; //Assign squared value to sum each time
		}
		System.out.print(sum);
		System.out.println("");
		
		//Part 3: Output hollow rect. from input
		//3.1: Ask user for input
		Scanner stdin = new Scanner(System.in);
		System.out.println("Part 3: Enter number of rows: ");
		int row = stdin.nextInt();
		
		System.out.println("Enter number of columns: ");
		int col = stdin.nextInt();
		
		//Exit program if user enter 0 for col/row
		if(row == 0 || col == 0) 
		{
			System.out.println("Can't create a rectangle. F11 to run again (on Windows)");
			System.exit(0);
		}
		
		//3.2: Print out * based on input
		for (int r = 1; r <= row; r++) //Run counter r each row
		{
			for (int c = 1; c <= col; c++) //Run counter c each col
			{
				//If not top, bottom row + first, last col, print space
				if(r > 1 && r < row && c > 1 && c < col) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//3.3 Final result printout
			System.out.println("");
		}
		
	}

}
