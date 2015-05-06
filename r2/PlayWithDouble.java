package r2;

public class PlayWithDouble {

	public static void main(String[] args) {
		double first, second, sum, difference, product; 
		@SuppressWarnings("unused")
		int third; //unused//
		first = 5.06;
		second = -0.87;
		
		sum = first + second; 
		System.out.println("The sum is " + sum);
		
		difference = first / second;
		product = first * second;
		
		System.out.println("The difference is " + difference);
		System.out.println("The product is " + product);		
	}

}
