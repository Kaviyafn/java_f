import java.util.Scanner;
public class Polindrome_string {
    String rev = "";

    public void String_withoutbin(String str) {
        rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed : " + rev);
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        System.out.println();
    }
    public void StringBuilder_bin(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        System.out.println("Reversed : " + rev);
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        System.out.println();
    }
    public void StringBuffer_bin(String str) {
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        System.out.println("Reversed : " + rev);
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        System.out.println();
    }
    public void String_builtin(String str) {
        rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev=rev+str.charAt(i);
        }
        System.out.println("Reversed : " + rev);
        if (str.equalsIgnoreCase(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Something: ");
        String str = in.nextLine();

        Polindrome_string obj = new Polindrome_string();
        System.out.println(" Using String Built-in Functions:");
        obj.String_builtin(str);
        System.out.println(" Using StringBuilder:");
        obj.StringBuilder_bin(str);
        System.out.println(" Using StringBuffer:");
        obj.StringBuffer_bin(str);
        System.out.println(" Without Built-in Function:");
        obj.String_withoutbin(str);


    }
}
