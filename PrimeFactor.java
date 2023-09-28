/*
 Name :AlekhyaDidige
 Course :Advanced Programming Concepts MCIS5103
 Section:031
 Student number:999903739
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int number;

        // Keep asking for input until a valid number between 11 and 1900 is entered.
        do {
            System.out.print("Enter a number between 11 and 1900: ");
            while (!userInput.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 11 and 1900.");
                System.out.print("Enter a number between 11 and 1900: ");
                userInput.next();
            }
            number = userInput.nextInt();
        } while (number < 11 || number > 1900);

        userInput.close();

        System.out.print("Prime factors of " + number + " in ascending order: ");
        ArrayList<Integer> primeFactor = getPrimeFactor(number);

        for (int factor : primeFactor) {
            System.out.print(factor + " ");
        }
    }

    // Function to find prime factors of a number.
    public static ArrayList<Integer> getPrimeFactor(int n) {
        ArrayList<Integer> Factors = new ArrayList<>();
        while (n % 2 == 0) {
            Factors.add(2);
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                Factors.add(i);
                n /= i;
            }
        }
        if (n > 2) {
            Factors.add(n);
        }
        return Factors;
    }
}
