/*
 Name :AlekhyaDidige
 Course :Advanced Programming Concepts MCIS5103
 Section:031
 Student number:999903739
 */

public class MonthName
{
	public static String month_Name(int month)
	{   //case statement logic 
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
    // user input and main function
	public static void main( String[] args )
	{
		System.out.println( "Month 1: " + month_Name(1) );
		System.out.println( "Month 2: " + month_Name(2) );
		System.out.println( "Month 3: " + month_Name(3) );
		System.out.println( "Month 4: " + month_Name(4) );
		System.out.println( "Month 5: " + month_Name(5) );
		System.out.println( "Month 6: " + month_Name(6) );
		System.out.println( "Month 7: " + month_Name(7) );
		System.out.println( "Month 8: " + month_Name(8) );
		System.out.println( "Month 9: " + month_Name(9) );
		System.out.println( "Month 10: " + month_Name(10) );
		System.out.println( "Month 11: " + month_Name(11) );
		System.out.println( "Month 12: " + month_Name(12) );
		System.out.println( "Month 43: " + month_Name(43) );
	}
}