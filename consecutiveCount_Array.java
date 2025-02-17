public class consecutiveCount_Array {
    public static void main(String[] args) {

        String input = "11000110011100000110011000";

        // Simulate user input of "1"
        int choice = 0;

        if (choice == 0) {
            countConsecutiveOnes(input);
        }
    }

    public static void countConsecutiveOnes(String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println("No input provided.");
            return;
        }

        int count = 0;
        boolean inConsecutiveOnes = false;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '1') {
                if (!inConsecutiveOnes) {
                    inConsecutiveOnes = true;
                    count++;
                }
            } else {
                inConsecutiveOnes = false;
            }
        }

        System.out.println("Consecutive 0's count: " + count);  
    }
}
