/*
 Name :AlekhyaDidige
 Course :Advanced Programming Concepts MCIS5103
 Section:031
 Student number:999903739
 */


 import java.util.Scanner;

public class SingledigitNumber {
    public static void main(String[] args) {
        Scanner digits = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = digits.nextInt();
        
        int value = SingleDigit(number);
        
        System.out.println("The single digit number: " + value);
    }

    public static int SingleDigit(long integer) {
        int value = 0;
        
        while (integer > 0) {
            value += integer % 10;
            integer /= 10;
        }
        while (value > 9) {
            int newdigit = 0;
            while (value > 0) {
                newdigit += value % 10;
                value /= 10;
            }
            value = newdigit;
        }
        
        return value;
    }
}
