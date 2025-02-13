import java.util.Scanner;
class Prymid_number
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++) {
                System.out.print(k);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }



    }
}
