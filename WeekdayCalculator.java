/*
 Name :AlekhyaDidige
 Course :Advanced Programming Concepts MCIS5103
 Section:031
 Student number:999903739
 */

import java.util.Scanner;

public class WeekdayCalculator
{
	public static void main( String[] args )
	{
		//user input code 
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to MCIS5103's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();
        // sample examples complted actual input now
		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

		
		System.out.println("You were born on "+ weekday(mm,dd,yyyy));
	}


	public static String weekday( int mm, int dd, int yyyy )
	{   
		//logic for date calculation
		int yy = yyyy - 1900;
		int total = yy / 4 + yy + dd + Month_offset(mm);
		if (is_leap(yyyy) && (mm == 1 || mm == 2)) {
			total -= 1;
		}
	
		int Weekday = total % 7;
		String dayOfWeek = weekday_name(Weekday);
		String monthName = Month_name(mm);
	
		return dayOfWeek + ", " + monthName + " " + dd + ", " + yyyy;

	}
    // /addding the Month Name for the getting name of the month 

	public static String Month_name(int month)
	{
		String monthName;
        switch (month)
         {
            case 1:  monthName = "January";       
            break;
            case 2:  monthName = "February";     
             break;
            case 3:  monthName = "March";        
             break;
            case 4:  monthName = "April";        
             break;
            case 5:  monthName = "May";          
             break;
            case 6:  monthName = "June";          
            break;
            case 7:  monthName = "July";         
             break;
            case 8:  monthName = "August";       
             break;
            case 9:  monthName = "September";    
             break;
            case 10: monthName = "October";      
             break;
            case 11: monthName = "November";     
             break;
            case 12: monthName = "December";     
             break;
            default: monthName = "Invalid month"; 
            break;
        }
        return monthName;
	}
    // /addding the Month offset for the getting offset of the month 
	public static int Month_offset(int mm)
	{    
		int mmoffset;
        switch (mm)
         {
            case 1:  mmoffset =1 ;       
            break;
            case 2:   mmoffset =4;     
             break;
            case 3:   mmoffset =4;        
             break;
            case 4:   mmoffset =0;        
             break;
            case 5:   mmoffset =2;          
             break;
            case 6:   mmoffset =5;          
            break;
            case 7:   mmoffset =0;         
             break;
            case 8:   mmoffset =3;       
             break;
            case 9:   mmoffset =6;    
             break;
            case 10:  mmoffset =1;      
             break;
            case 11:  mmoffset =4;     
             break;
            case 12:  mmoffset =6;     
             break;
        	default:  mmoffset =-1; 
            break;
        }
        return mmoffset;
	}


	
	public static String weekday_name(int Weekday) 
	{
    	String[] weekdays = {"Saturday", 
							"Sunday", 
							"Monday", 
							"Tuesday", 
							"Wednesday", 
							"Thursday", 
							"Friday"};
    
		return weekdays[Weekday];
	}

	public static boolean is_leap( int year )
	{
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;
	}
}