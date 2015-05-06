package finalReview;

public class Rev2 {

	public static void main(String[] args) {
		for (int i = -10; i<11; i++)
		{
			System.out.println(i);
		}
		
		for (int j = 25; j < 88; j++)
		{
			if (j%7 == 0 && j%3 == 0)
			{
				System.out.println(j);
			}
		}
		
		for (int k = 167; k < 456; k++)
		{
			if (k%7 != 0 && k %11!=0)
			{
				System.out.println(k);
			}
		}
		
//		int number = 1 ;
//		while ( number <= 5 ) {
//		System.out.print (number + " ");
//		number++ ;
//		} // end while
//		
//		System.out.println("-------");
//		
//		int s = 1;
//		for ( int n = 1; n < 4; n++ ) {
//		s = s + n;
//		System.out.print (s + " ");
//		} // end for n
		
		for ( int n = 1; n <= 4 ; n++ ) {
			for ( int j = 1; j <= 3 ; j++ ) {
			int m = n + j;
			System.out.print (m + " ");
			} // end for j
			System.out.println ( );
			} // end for n

	}

}
