/*
 Name :AlekhyaDidige
 Course :Advanced Programming Concepts MCIS5103
 Section:031
 Student number:999903739
 */

import java.util.ArrayList;
import java.util.Scanner;


public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value;

        do {
            System.out.print("Enter a value between 11 and 1900: ");
            value = input.nextInt();

            if (value < 11 || value > 1900) {
                System.out.println("Error: Value must be between 11 and 1900.");
            }
        } while (value < 11 || value > 1900);

        System.out.println("Prime factors of " + value + " with their powers:");

        // Logic to find and print the primefactors of the given input
       
        ArrayList<String> Factors = new ArrayList<>();
        for (int factor = 2; factor <= value; factor++) {
            int power = 0;
            while (value % factor == 0) {
                power++;
                value /= factor;
            }
            
            if (power > 0) {
                
                Factors.add(factor + "^" + power);
                Factors.add("*");
                
    
            }
            
        }
        
        for (int i = 0; i < Factors.size()-1; i++) {
 

            System.out.print(Factors.get(i) + " ");
        
        }
        


        input.close();
    }
    }

