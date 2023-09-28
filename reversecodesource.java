public class Reversecode {
    import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();
        
        // Close the scanner as we have finished reading input
        scanner.close();
        
        // Call the reverseNumber method to reverse the digits
        int reversedNumber = reverseNumber(inputNumber);
        
        // Display the reversed number
        System.out.println("Reversed number: " + reversedNumber);
    }

    // Method to reverse the digits of a number
    public static int reverseNumber(int number) {
        int reversed = 0;
        
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            reversed = reversed * 10 + digit;  // Append the digit to the reversed number
            number /= 10;  // Remove the last digit from the original number
        }
        
        return reversed;
    }
}

}
