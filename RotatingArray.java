import java.util.Arrays;

public class RotatingArray {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 4},
                {0, 4, 6},
                {9, 3, 5}
        };
        printMatrix(matrix);
        rotateClockwise(matrix);
        System.out.println("Matrix After Rotating :");
        printMatrix(matrix);
    }

    public static void rotateClockwise(int[][] matrix) {


        int row = matrix.length;
        int col = matrix.length;
        if (row < 2 || col < 2) {
            return;
        }
        int temp = matrix[0][0];

        for (int i = 0; i < row - 1; i++) {
            matrix[i][0] = matrix[i + 1][0];
        }
        for (int j = 0; j < col - 1; j++) {
            matrix[row - 1][j] = matrix[row - 1][j + 1];
        }
        for (int i = row - 1; i > 0; i--) {
            matrix[i][col - 1] = matrix[i - 1][col - 1];
        }
        for (int j = col - 1; j > 1; j--) {
            matrix[0][j] = matrix[0][j - 1];
        }

        matrix[0][1] = temp;
    }


    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.print(Arrays.toString(row));
        }
        System.out.println();
    }
}
