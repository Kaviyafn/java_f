import java.util.Arrays;
import java.util.Scanner;

public class reverse_no {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the index up to which to reverse : ");
        int n = scanner.nextInt();


        if (n > 0 && n <= arr.length) {

            for (int i = 0; i < n / 2; i++) {
                int t = arr[i];
                arr[i] = arr[n - 1 - i];
                arr[n - 1 - i] = t;
            }


            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("Invalid input, please enter a number between 1 and " + arr.length);
        }

        scanner.close();
    }
}
