/*
 Name :AlekhyaDidige
 Course :Advanced Programming Concepts MCIS5103
 Section:031
 Student number:999903739
 */
    
import java.util.Scanner;

public class NumberR {
    public static void main(String[] args) {
       
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Number = userinput.nextInt();
        userinput.close();

        int capacity = Numberstr(Number);
        System.out.println("R number: " + capacity);
    }

    public static int Numberstr(int number) {
        int value = 0;
        
        while (number != 0) {
            int num = number % 10;  
            value = value * 10 + num; 
            number /= 10;
        }
        
        return value;
    }
}
