package r3;
import java.util.*;
public class Rectangle {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Please enter width and length: ");
		
		double width = stdin.nextDouble();
		double length = stdin.nextDouble();
		double area = width * length;
		System.out.println("The area of this rectangle is: " + area);
		
		double perimeter = 2 * (width  + length);
		System.out.println("The perimeter of this rectangle is: "+ perimeter);

	}

}
