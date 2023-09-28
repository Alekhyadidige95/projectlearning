import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        int result = calculateSingleDigitSum(number);
        
        System.out.println("The sum of digits as a single digit is: " + result);
    }

    public static int calculateSingleDigitSum(long num) {
        int sum = 0;
        
        // Calculate the sum of digits
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        // If the sum is still greater than 9, repeat the process
        while (sum > 9) {
            int newSum = 0;
            while (sum > 0) {
                newSum += sum % 10;
                sum /= 10;
            }
            sum = newSum;
        }
        
        return sum;
    }
}


