package pa1;

public class Kitchen {

	public static void main(String[] args) {
		int length = 10; //length of the kitchen in ft.
		int breadth = 5; // breadth of the kitchen in ft.
		double costperSqInch = 1.2; //1 sqFt. =144 sqInch 
		double totalcost = length * breadth * 144*costperSqInch;
		System.out.println("The total cost to tile the kitchen is $" + totalcost );
	}

}
