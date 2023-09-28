/*
 Name :AlekhyaDidige
 Course :Advanced Programming Concepts MCIS5103
 Section:031
 Student number:999903739
 */

import java.util.Scanner;

public class ConvertNumber {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int convertNumber = myobj.nextInt();
        myobj.close();

        String integerNumber = Integeroctal(convertNumber);
        System.out.println("Octal equivalent: " + integerNumber);
    }

    public static String Integeroctal(int BaseNumber) {
        if (BaseNumber == 0) {
            return "0";
        }

        StringBuilder integer = new StringBuilder();
        while (BaseNumber > 0) {
            int remainder = BaseNumber % 8;
            integer.insert(0, remainder); 
            BaseNumber /= 8; 
        }

        return integer.toString();
    }
}

