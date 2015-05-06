package finalReview;
import java.util.*;
import java.io.*;
public class Rev7 {

	public static void main(String[] args) 
	throws FileNotFoundException {
		ArrayList<Integer> data1 = new ArrayList<Integer>();
		File f1 = new File ("scores.txt");
		Scanner fileIn1 = new Scanner (f1);
		
		while (fileIn1.hasNextInt())
		{
			int num = fileIn1.nextInt();
			System.out.println(num);
		}
	
		int [] tall = new int [100];
		int i = 0;
		while(fileIn1.hasNextInt())
		{
		     tall[i++] = fileIn1.nextInt();
		}
		System.out.print(Arrays.toString(tall));
	}
}