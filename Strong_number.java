import java.util.Scanner;

public class Strong_number {

    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
return fact;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number:");
        int num= in.nextInt();
        int temp=num;
        int sum=0;
        while (temp>0){
            int digits=temp%10;
            sum+=factorial(digits);
            System.out.println("factoril of "+digits+" is "+ factorial(digits));

            temp=temp/10;

        }
        System.out.println("sum of digits:"+sum);
        if(sum==num){
            System.out.println("the given number is stong number");
        }
        else{
            System.out.println("the given number is not strong number");
        }


    }
}
