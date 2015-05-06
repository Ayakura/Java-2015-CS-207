package r11;
import java.util.*;
public class BasicsOfArrayList {
	public static void main(String[] args) {
		
//	Scanner stdin = new Scanner(System.in);
//	ArrayList<Integer> scores = new ArrayList<Integer>();
//	System.out.println("size = " + scores.size());
//	
//	scores.add(56);
//	
//	System.out.println("size = " + scores.size());
//	scores.add(-67);
//	
//	System.out.println("size = " + scores.size());
//	scores.get(0);
//	scores.get(1);
//	
//	scores.add(-78);
//	
//	ArrayList<Double> data = new ArrayList<Double>();
//	
//	for(int i = 1; i<= 5; i++) 
//	{
//		System.out.println("Please enter " + i +"th number");
//		double num = stdin.nextDouble();
//		data.add(num);
//	}
//
//	for(int i = data.size(); i > 0; i--)
//	{
//		System.out.print(data + " " );
//	}
	//-------------------------------------------------------------------------
		Scanner stdin = new Scanner(System.in);
		ArrayList<Integer> data = new ArrayList<Integer>();
		System.out.println("Enter a list of integers, end the list by typing a non-integer: ");
		
		while (stdin.hasNextInt()) {
			int num = stdin.nextInt();
			data.add(num);
			}
		
		int M1List = sumList(data);
		System.out.println(M1List/data.size());
		
		printList(data);
		
	
	}
	public static void printList(ArrayList<Integer> list)
	{
		System.out.println(list);
	}
	
	public static int sumList(ArrayList<Integer> list)
	{
		int sum = 0;
		
		for (int i = 0; i < list.size(); i++)
		{
			sum = sum + list.get(i);
		}
		return sum;
	}
	//------------------------------------------------------------------------------
	
	
	
}





























