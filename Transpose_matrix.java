import java.util.Scanner;

public class Transpose_matrix {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the rows:");
            int rows = in.nextInt();

            System.out.print("Enter the col:");
            int col = in.nextInt();

            int[][] m = new int[rows][col];

            System.out.print("Enter the elements:");
            System.out.println();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print("Elements at:[" + i + "][" + j + "]:");
                    m[i][j] = in.nextInt();
                }
            }
            System.out.print("\nthe 2d array:");
            System.out.println();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(m[i][j] + " ");
                }
                System.out.println();
            }
            System.out.print("\nthe tarnspose 2d array:");
            System.out.println();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(m[j][i] + " ");
                }
                System.out.println();
            }

            in.close();
        }
    }

