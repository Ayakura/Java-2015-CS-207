package finalReview;
import java.util.*;
import java.io.*;
public class MyClass {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Integer> data1 = new ArrayList<Integer>();
		File f1 = new File ("data1.txt");
		Scanner fileIn1 = new Scanner (f1);
		
		while (fileIn1.hasNextInt())
		{
			int num = fileIn1.nextInt();
			System.out.println(num);
		}
		
		ArrayList<Integer> data2 = new ArrayList<Integer>();
		File f2 = new File ("data2.txt");
		Scanner fileIn2 = new Scanner (f2);
		
		while (fileIn2.hasNextInt())
		{
			int num = fileIn2.nextInt();
			System.out.println(num);
		}
		
		int maximum = max(data1); // call method max
		double avg = average(data2); // call method average

	}
	public static int max(ArrayList<Integer> data)
	{
		int maxNum = data.get(0);
		for (int i = 0; i < data.size(); i++)
		{
			if (data.get(i) > maxNum)
			{
				maxNum = data.get(i);
			}
		}
		return maxNum;
	}
	
	public static double average(ArrayList<Integer> data)
	{
		int sum = 0;
		for (int i = 0; i <data.size(); i++)
		{
			sum = sum + data.get(i);
		}
		return sum/data.size();
	}
	

}





















