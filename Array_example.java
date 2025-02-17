import java.util.Scanner;

public class Array_example {
    public static void main(String s[])
    {
        int arr[]={1,2,3,4,5};
        for(int i:arr){  //printing for each loop
            System.out.print(i);
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){  //printing arr value using intex i
            System.out.print(arr[i]);
        }
        System.out.println();
        for(int i=arr.length-1;i>=0; i--){  //printing reverse of arr value using i index
            System.out.print(arr[i]);
        }
    }
}
