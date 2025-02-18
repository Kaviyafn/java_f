import java.util.Arrays;

public class largest_CombinationOFarray {
    public static void main(String[] args) {
        int[] testCase = {3, 30, 34, 5, 9};

            String[] strArr = new String[testCase.length];
            for (int i = 0; i < testCase.length; i++) {
                strArr[i] = String.valueOf(testCase[i]);
            }
            Arrays.sort(strArr, (a, b) -> (b + a).compareTo(a + b));

            String result = String.join("", strArr);

            result = result.startsWith("0") ? "0" : result;

            System.out.println("Largest combination for " + Arrays.toString(testCase) + ": " + result);
        }
    }



