package pa4;

public class WhileLoop {

	public static void main(String[] args) {
		//Part 1: Print out even numbers separated by a space
		int counter = 0;
		int i = 4;
		System.out.print("Part 1: ");
		while(i<=20)
		{
			if (i%2 == 0)
			{
				System.out.print(i + " ");
			}
			i++;
			
		}
		System.out.println("");
		
		//Part 2: Print integers that are div by 3 or 5
		int j = 34;
		System.out.print("Part 2: ");
		while(j<=49)
		{
			if (j%3 == 0 || j%5 == 0)
			{
				System.out.print(j + " ");
			}
			j++;
		}
		System.out.println("");
		
		//Part 3: Output sum of multiples that are div by 4
		int k = 2;
		System.out.print("Part 3: ");
		while (k<=100)
		{
			if (k%4 == 0)
			{
				counter = counter + k;
				//System.out.print(k + " "); to test 
				
			}
			k++;
		}
		System.out.print(counter);

	}

}
