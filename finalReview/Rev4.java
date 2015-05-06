package finalReview;
import java.util.*;
public class Rev4 {

	public static void main(String[] args) {
		int [ ] iArray = new int [9];
		for ( int i = 0; i < iArray.length ; i++)
		{
		iArray [i] = i ;
		System.out.print( iArray [i] + " ") ;
		} // end for i
		
		String name = "Candy";
		ArrayList<Double> balance = new ArrayList<Double>();
		balance.add (29.95);
		balance.add (3.14);
		balance.add (-1.37);
		int num1 = name.length();
		int num2 = balance.size();
		System.out.println(num1 + " " + num2);
		System.out.println(name.charAt(0) + " " + name.charAt(4));
		System.out.println(balance.get(1) + " " + balance.get(2));
		
		//
		String inputValue = "skcor 702 SmoC";
		String outputValue = mystery1(inputValue);
		System.out.println(outputValue);
		
		//
		int s = mystery2(-3,-4);
		System.out.println(s);

	}
	public static String mystery1(String s) {
		String result = "";
		int k = s.length();
		for(int i = k-1; i >= 0; i = i-1)
		{
		char c = s.charAt(i);
		result = result + c;
		}// end for i
		return result;
		}// end mystery1
	
	public static int mystery2(int x, int y) {
		if (x > y)return x*x;
		else return y*y;
		}// end mystery2

}
