public class PyramidPattern_for1 {
    public static void main(String[] args) {
        int rows = 4; 

        for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
           
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("1 ");
            }
            System.out.println(); 
        }
    }
}
