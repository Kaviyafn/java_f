import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        int num, i;
        boolean isPrime = true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        
        if (num <= 1) {
            isPrime = false;
        } else {
           
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
    }
}


