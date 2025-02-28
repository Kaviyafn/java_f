
import java.util.Scanner;

    public class Twisted_prime {
        static boolean isPrime(int n) {
            if (n < 2)
                return false;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }

        static int reverse(int n) {
            int rev = 0;
            while (n > 0) {
                int digit = n % 10;
                rev = (rev * 10) + digit;
                n = n / 10;
            }
            return rev;
        }

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number: ");
            int num = sc.nextInt();

            if (isPrime(num) && isPrime(reverse(num)))
                System.out.println(num + " is Twisted Prime Number.");
            else
                System.out.println(num + " is NOT Twisted Prime Number.");


        }
    }





