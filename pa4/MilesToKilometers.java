package pa4;

public class MilesToKilometers {

	public static void main(String[] args) {
		System.out.println("Miles       Kilometers"); //7 spaces
		int sumMile = 0;
		int sumKilo = 0;
		for (int m = 0; m <= 90; m+=10)
		{
			if (m < 10)
			{
				System.out.print(" "); //Ensure that the digits line up 
			}
			sumMile = m;
			sumKilo = 8*sumMile/5;
			
			System.out.println(sumMile + "             " + sumKilo*1.0); //turn sumKilo into a double
			//13 spaces between numbers
		}
		
		
	}

}
