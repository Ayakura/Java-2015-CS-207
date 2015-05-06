package finalReview;

import java.util.ArrayList;

public class Rev6 {

	public static void main(String[] args) {
		trianglize(10);
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(4);
		a.add(5);
		a.add(16);
		int[] test = reverse(a);
		
		for (int i = 0; i < test.length; i++)
		{
			System.out.print(test[i] + " ");
		}
		
		ArrayList<Integer> testRevList = reverseList(a);
		System.out.print(testRevList);
	}
	
	public static void trianglize(int n)
	{
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
	
	public static int[] reverse (ArrayList<Integer> data)
	{
		int[] reversed = new int[data.size()];
		for (int i = data.size()-1; i >= 0; i--)
		{
			reversed[i] = data.get(i);
		}
		return reversed;
	}
	
	public static ArrayList<Integer> reverseList (ArrayList<Integer> data)
	{
		ArrayList<Integer> reversed = new ArrayList<Integer>();
		for (int i = data.size()-1; i >= 0; i--)
		{
			reversed.add(data.get(i));
		}
		return reversed;
	}

}





















