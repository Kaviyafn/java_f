import java.util.Scanner;

public class Shift_arrayElements {
                public static void main(String[] args) {
                int[] a = {10, 20, 5, 1, 3, 2};
                int n = 3;

                for (int i = 0; i < n; i++) {
                    int last = a[a.length - 1]; 

                    // Shift all elements to the right
                    for (int j = a.length - 1; j > 0; j--) {
                        a[j] = a[j - 1];
                    }

                    a[0] = last;

                    printArray(a);
                }
            }


            public static void printArray(int[] arr) {
                for (int num : arr) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }



