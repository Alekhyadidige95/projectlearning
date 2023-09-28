import java.util.Scanner;
public class PrimeFactorb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.print("Prime factors with powers of " + n + " are: ");
        for (int d = 2; d <= n; d++) 
        {
            int count = 0;
            while (n % d == 0)
             {
                n /= d;
                count++;
            }
            if (d > 0) {
                System.out.print(d + "^" + count + " ");
            }
        }
    }
}
