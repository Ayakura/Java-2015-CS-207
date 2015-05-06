package pa6;
import java.util.*;
import java.io.*;
public class WeeklyCalendar {

	public static void main(String[] args) 
	throws FileNotFoundException
	{
		boolean over = false;
		while (over == false)
		{
		ArrayList<String> appointmentList= new ArrayList<String>();
		appointmentList = readFromFile("calendar.txt");
		
		System.out.println("Enter one of the following: ");
		System.out.println("addAppointment, removeAppointment, printDay, printAll, quit");
		Scanner stdin = new Scanner(System.in);
		String choice = stdin.nextLine();
		
		
		//add
		if (choice.equals("addAppointment"))
		{
			System.out.println("Enter the date and time");
			String day = stdin.nextLine();
			String time = stdin.nextLine();
			addAppointment(appointmentList, day, time);
			
			//test method
			System.out.print(appointmentList + "\n");
		}
		
		
		//remove
		if (choice.equals("removeAppointment"))
		{
			System.out.println("Enter the date and time");
			String day = stdin.nextLine();
			String time = stdin.nextLine();
			removeAppointment(appointmentList, day, time);
			
			//test method
			System.out.print(appointmentList + "\n");
		}
		
		//print Day
		if (choice.equals("printDay"))
		{
			System.out.println("Enter weekday: ");
			String weekday = stdin.nextLine();
			ArrayList<String> weekdayApp = appointmentsOnDay(appointmentList, weekday);
			System.out.println(weekdayApp + "\n");	
		}
		
		//print Calendar
		if (choice.equalsIgnoreCase("printAll"))
		{
			System.out.println("Weekly Calendar: ");
			printAppointmentCalendar(appointmentList);
			System.out.println("");
		}
		
		if (choice.equals("quit"))
		{
			over = true;
			System.exit(0);
		}
	}
}
	public static boolean hasAppointmentAt (ArrayList<String> appointmentList, 
			String specifiedDay, String specifiedTime)
	{
		//split line into 2
		String Con = specifiedDay + "@" + specifiedTime;
		for (int i =0; i < appointmentList.size(); i++)
		{
			String singleLine = appointmentList.get(i);
			if (Con.equals(singleLine))
			{
				return true;
			}
		}
		System.out.println("You don't have any appointment at this time");
		return false;
	}
	
	public static boolean addAppointment (ArrayList<String> appointmentList, 
			String specifiedDay, String specifiedTime)
	throws FileNotFoundException
	{
		String Con = specifiedDay + "@" + specifiedTime;
		
		for (int i =0; i < appointmentList.size(); i++)
		{
			if (!hasAppointmentAt(appointmentList, specifiedDay, specifiedTime))
			{
				appointmentList.add(Con);
				System.out.println("Appointment added~");
				return true;
			}
		}
		
		System.out.println("There is another appointment at that time, can not add");
		return false;
	}
	
	public static boolean removeAppointment (ArrayList<String> appointmentList, 
			String specifiedDay, String specifiedTime)
	{
		//split line into 2
		String Con = specifiedDay + "@" + specifiedTime;
		
		//remove the line plus the @ symbol
		for (int i = 0; i < appointmentList.size(); i++)
		{
			if (hasAppointmentAt(appointmentList, specifiedDay, specifiedTime))
			{
			appointmentList.remove(Con);
			System.out.println("Appointment removed~");
			return true;
			}
		}
		System.out.println("There's no appointment at that time, can't remove");
		return false;
	}
	
	public static ArrayList<String> appointmentsOnDay(ArrayList<String> appointmentList, 
			String specifiedDay)
	{
		//String appointmentTime ="";
		//String appointmentDay = "";
		ArrayList<String> timeArray = new ArrayList<String>();
		for (int i = 0; i < appointmentList.size(); i++)
		{
			String appointmentTime = appointmentList.get(i).substring(appointmentList.get(i).indexOf("@")+1,
					appointmentList.get(i).length());
			
			String appointmentDay = appointmentList.get(i).substring(0, appointmentList.get(i).indexOf("@"));
			if (appointmentDay.equals(specifiedDay))
			{
				timeArray.add(appointmentTime);
			}
		}
		return timeArray;
	}
	
	public static void printAppointmentCalendar (ArrayList<String> appointmentList)
	{
		//print according to the appointment day
		System.out.print("Monday: ");
		for (int i = 0; i <appointmentsOnDay(appointmentList, "Monday").size(); i++)
		{
			System.out.print(appointmentsOnDay(appointmentList, "Monday").get(i) + " ");
		}
		System.out.println("");
		
		System.out.print("Tuesday: ");
		for (int i = 0; i <appointmentsOnDay(appointmentList, "Tuesday").size(); i++)
		{
			System.out.print(appointmentsOnDay(appointmentList, "Tuesday").get(i) + " ");
		}
		System.out.println("");
		
		System.out.print("Wednesday: ");
		for (int i = 0; i <appointmentsOnDay(appointmentList, "Wednesday").size(); i++)
		{
			System.out.print(appointmentsOnDay(appointmentList, "Wednesday").get(i) + " ");
		}
		System.out.println("");
		
		System.out.print("Thursday: ");
		for (int i = 0; i <appointmentsOnDay(appointmentList, "Thursday").size(); i++)
		{
			System.out.print(appointmentsOnDay(appointmentList, "Thursday").get(i) + " ");
		}
		System.out.println("");
		
		System.out.print("Friday: ");
		for (int i = 0; i <appointmentsOnDay(appointmentList, "Friday").size(); i++)
		{
			System.out.print(appointmentsOnDay(appointmentList, "Friday").get(i) + " ");
		}
		System.out.println("");
		
		System.out.print("Saturday: ");
		for (int i = 0; i <appointmentsOnDay(appointmentList, "Saturday").size(); i++)
		{
			System.out.print(appointmentsOnDay(appointmentList, "Saturday").get(i) + " ");
		}
		System.out.println("");
		
		System.out.print("Sunday: ");
		for (int i = 0; i <appointmentsOnDay(appointmentList, "Sunday").size(); i++)
		{
			System.out.print(appointmentsOnDay(appointmentList, "Sunday").get(i) + " ");
		}
	}
	
	public static ArrayList<String> readFromFile (String file)
	throws FileNotFoundException
	{
			Scanner s = new Scanner(new File(file));
			
			ArrayList<String> list = new ArrayList<String>();
			
			while (s.hasNextLine())
			{
			    list.add(s.nextLine());
			}
			
			//ArrayList<String> newArray = new ArrayList<String>(list);
			
			return list;
	}

}






















