/*String pl;
	int plMass, huMass; 
	double radius, gConst, gForce, grav*/
		
package pa2;
import java.util.Scanner;
public class GravitationalForce {

	public static void main(String[] args) {
		//Step 1: assign constant value gConst 
		final double gConst = 6.673 * Math.pow(10,-11); //System.out.println (gConst);
		
		Scanner stdin = new Scanner(System.in);
		
		//Step 2: Get planet's name + weight + radius + human's weight input from user:
		System.out.println("Please enter the name of the planet and its weight in quintillion kilograms: ");
		String pl = stdin.next();
		int plMass = stdin.nextInt(); //System.out.println("You entered " + pl + " " + plMass);

		System.out.println("Enter the weight of the person in kilograms: ");
		int huMass = stdin.nextInt(); //System.out.println("You entered "+ huMass);
		
		System.out.println("Please enter the radius of the planet " + pl +" in million meters: ");
		double radius = stdin.nextDouble(); //System.out.println("You entered " + radius);
		
		//Step 3: Calculate gForce (gravitational force then print output + text
		double gForce = gConst * ((plMass * Math.pow(10,18) * huMass)/Math.pow(radius * Math.pow(10, 6), 2));
		System.out.println("The gravitational force of planet " + pl + " on the person is " + 
		Math.floor(gForce*1000000.0)/1000000.0);
		//rounded down with Math.floor to get the exact output needed
		
		//Step 4: Calculate gravity then print output + text
		double grav = gConst * (plMass * Math.pow(10,18)/Math.pow(radius * Math.pow(10, 6), 2)); 
		System.out.println("The gravity of planet Alderaan is " + 
		Math.floor(grav*1000.0)/1000.0 + " meters per seconds squared");
		//rounded down with Math.floor to get the exact output needed
	}

}
