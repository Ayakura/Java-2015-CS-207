package r2;

public class PlayWithInt {
	public static void main(String[] args) {
	int first = 56; //Can't have a decimal here because it's an int. Can be converted using (int) 5.6//
	int second = 87;
	@SuppressWarnings("unused")
	int third;
	
	int sum = first + second;
	System.out.println("sum = " + sum);
	
	int difference = first / second;
	int product = first * second;
	System.out.println("difference = " + difference);
	System.out.println("product = " + product);	
	}
}