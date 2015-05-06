package r11;
import java.util.*;
public class ArrayListPractice {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(4);
		a.add(5);
		a.add(16);
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(9);
		b.add(0);
		b.add(3);
		
		ArrayList<Integer> test = new ArrayList<Integer>();
		test = reverseAppend(a,b);
		System.out.println(test);
	}
	
	public static ArrayList<Integer> reverseAppend
    (ArrayList<Integer> a,
     ArrayList<Integer> b)
     {
		
		ArrayList<Integer> c = new ArrayList<Integer>();
		for (int j = 0; j < a.size(); j++)
		{
			c.add(a.get(j));
		}
		
		for (int i = b.size()-1; i >=0; i--)
		{
			c.add(b.get(i));
		}
		return c;
     }
}









