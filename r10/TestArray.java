package r10;
import java.util.Scanner;
public class TestArray {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double[] scores = new double[5];
		System.out.println("scores length = " + scores.length);
		
		int[] data = new int[25];
		System.out.println("data length = " + data.length);
		
		int[] values = {2, -3, 4, 6, 8 ,-99};
		System.out.println("values length =" + values.length);
		
		for(int i = 0; i < scores.length; i++) 
		{
			System.out.println("Please enter " + i +"th array value");
			scores[i]= stdin.nextDouble();
		}
		
		for(int i = 0; i < scores.length; i++)
		{
			System.out.print(scores[i] + " " );
		}
//
//		System.out.println("");// break
//		
//		for(int i = 0; i < values.length; i++)
//		{
//			System.out.print(values[i] + " " );
//		}
		
		System.out.println("");// break
		
//		for(int i = 0; i < data.length; i++) 
//		{
//			System.out.println("Please enter " + i +"th array value");
//			data[i]= stdin.nextInt();
//		}
//		
//		for(int i = 0; i < data.length; i++)
//		{
//			System.out.print(data[i] + " " );
//		}
		
		double testM1 = sumArray(scores);
		System.out.println("Sum = " + testM1);
		System.out.println(""); //break
		
		double[] scoresSquared = squareArray(scores);
		for (int i = 0; i < scoresSquared.length; i++)
		{
			System.out.print(scoresSquared[i]+ " ");
		}
	}
	public static double sumArray(double[] dArray)
	{
		double sum = 0;
		for (int i = 0; i < dArray.length; i++)
		{
			sum = sum + dArray[i];
		}
		return sum;
	}
	
	public static double[] squareArray(double[] dArray)
	{
		double[] squareArray = new double[dArray.length];
		for (int i = 0; i <= dArray.length-1; i++)
		{
			squareArray[i] = Math.pow(dArray[i], 2);
		}
		return squareArray;
	}

}











