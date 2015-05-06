package r2;
import java.util.Scanner;
@SuppressWarnings("unused")
public class Playground {

	public static void main(String[] args) {
	/*	//167%25/10/5/2
		System.out.println("Input Number: ");
		Scanner stdin = new Scanner(System.in);
		int input = stdin.nextInt();
		int quarters = input/25;
		System.out.print(quarters + " Quarter(s), ");
		int dime = input%25/10;
		System.out.print(dime + " Dime(s), ");
		int nickel = input%25%10/5;
		System.out.print(nickel + " Nickel(s), ");
		int penny = input%25%10%5/1;
		System.out.print(penny + " Pennies");
	
		
		//a,b,c quadratic equation
		System.out.println("Enter a, b and c ");
		Scanner stdin = new Scanner(System.in);
		double a = stdin.nextDouble();
		double b = stdin.nextDouble();
		double c = stdin.nextDouble();
		double delta = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
		
		double output = (-b - delta)/(2*a);
		System.out.println("Output is " + output);
		*/
		System.out.println("Input integer temperature: ");
		Scanner stdin = new Scanner(System.in);
		int temp = stdin.nextInt();
		if(temp >= 80) {
			System.out.println("Hot");
		}
		else if(temp >=65) {
			System.out.println("Pleasant");
		}
	}

}
