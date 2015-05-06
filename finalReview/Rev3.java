package finalReview;

public class Rev3 {

	public static void main(String[] args) {
		int value1 = compare (3, 5);
		int value2 = compare (5, 5);
		int value3 = compare (7, 5);
		System.out.println ("Results are:" + " " + value1 + " " + value2 
				+ " " + value3);
		//
		mystery (10, 5);
		mystery (6, 5);
	}
	
	// Method1 Definition
	public static int compare (int x, int y) {
	if (x > y) return 1;
	else if ( x < y) return -1;
	else return 0;
	} // end compare
	
	// Method2 Definition
	public static void mystery (int x, int y) {
	double result = (x + y) / (x - y);
	System.out.println ("Result is: " + result);
	} // end mystery

}
