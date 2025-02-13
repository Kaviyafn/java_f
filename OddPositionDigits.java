import java.util.Scanner;

public class OddPositionDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        int position = 0;
        int result = 0;
        int multiplier = 1;
        
        while (number > 0) {
            int digit = number % 10;
            if (position % 2 != 0) {
                result += digit * multiplier;
                multiplier *= 10;
            }
            number /= 10;
            position++;
        }
        
        System.out.println("Output: " + result);
    }
}
