import java.util.Scanner;

public class Calweekday
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to MCIS5103's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birthday, and it will tell you");
		System.out.println("tell you the day of the week on which you were born." );
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("11 9 2010 => " + weekday(11,9,2010));
		System.out.println(" 4 16 1989 => " + weekday(4,16,1989));
		System.out.println(" 6 22 2005 => " + weekday(6,22,2005));
		System.out.println(" 2 11 1970 => " + weekday(2,11,1970));
		System.out.println(" 8 20 2019 => " + weekday(8,20,2019));
		System.out.println("12 4 1962 => " + weekday(12,4,1962));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

		System.out.println("You were born on ");
	}


	public static String weekday( int mm, int dd, int yyyy )
	{
		
		int yy, total;
		String date = "";

		date = month_name(mm) + ", " + yyyy;

		return date;
	}
		
	public static boolean is_leap( int year )
	{
		
		boolean value;

		if ( year%400 == 0 )
			value = true;
		else if ( year%100 == 0 )
			value = false;
		else if ( year%4 == 0 )
			value = true;
		else
			value = false;
		
		return value;
	}
}