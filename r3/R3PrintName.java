package r3;

public class R3PrintName {

	public static void main(String[] args) {
		String firstName; // Declare a String variable named firstName
		String lastName; // Declare a String variable named lastName

		firstName = "John"; // Assign John to first name;
		lastName = "Atanasoff"; // Assign Atanasoff to lastName;
		
		String fullName; // Declare a String variable named fullName;
		
		fullName = firstName + lastName; // Concatenate firstName and lastName and assign to fullNamel;
		
		System.out.println(fullName); //print fullName
		
		int firstLen = firstName.length();
		int secondLen = lastName.length();
		int fullLen = fullName.length();
		
		System.out.println(firstLen + " + " + secondLen  + " = "  + fullLen);
		/* System.out.println(secondLen);
		System.out.println(fullLen); */
		
		String str1 = firstName.substring(0,3);
		String str2 = lastName.substring(1,7);
		
		System.out.println(str1 + " + " + str2);
	} // end of main method

} // end of R3PrintName class delaration
