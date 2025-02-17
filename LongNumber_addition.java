    import java.util.Arrays;
        public class LongNumber_addition {
            public static void main(String s[]) {
                String n1 = "999888777666555444333222111";
                String n2 = "999888777666555444333222111";
                char[] arr1 = n1.toCharArray();
                char[] arr2 = n2.toCharArray();
                char[] sum = new char[27];

                int carry = 0; // To store the carry value

                // Perform addition digit by digit
                for (int i = 26; i >= 0; i--) {
                    int digit1 = Integer.parseInt(Character.toString(arr1[i]));
                    int digit2 = Integer.parseInt(Character.toString(arr2[i]));
                    int tempSum = digit1 + digit2 + carry;  // Add digits and carry

                    // Store the result in sum array
                    sum[i] = Character.forDigit(tempSum % 10, 10);  // Get the last digit of the sum
                    carry = tempSum / 10;  // Get the carry (the first digit of the sum)
                }

                // If there's a carry left, handle it
                if (carry > 0) {
                    System.out.println("Carry: " + carry); // This will only print if there's a carry beyond the most significant digit
                }

                // Convert the sum to a string and print
                System.out.println("Array 1: " + Arrays.toString(arr1));
                System.out.println("Array 2: " + Arrays.toString(arr2));
                System.out.println("Sum: " + new String(sum));  // Correctly print the result as a string
            }
        }
