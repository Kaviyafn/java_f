import java.util.Scanner;

public class Automorphic_Number
{
    public static void main(String s[])
    {
        int n, temp, check=1,digit=0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        temp = n;
        while(temp>0)
        {
            temp = temp /10;
            digit++;
        }
        for(int i=1;i<=digit;i++)
            check = check*10;
        temp = (n*n)%check;
        System.out.println(temp);
        if(n == temp)
            System.out.println("Automorphic");
        else
            System.out.println("Not an automorphic");
    }
}