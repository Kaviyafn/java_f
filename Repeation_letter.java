import java.util.Scanner;

public class Repeation_letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String input = sc.next();
        String result = "";
        char prev = ' ';
        int num = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
            }
            else {
                if (num > 0) {
                    for (int j = 0; j < num-1; j++) {
                        result += prev;
                    }
                    num = 0;
                }
                result += ch;
                prev = ch;
            }
        }
        if (num > 0) {
            for (int j = 0; j < num-1; j++) {
                result += prev;
            }
        }
        System.out.println("Output: " + result);
    }
}


