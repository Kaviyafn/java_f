import java.util.Arrays;

public class adding2_array {
    public static void main(String[] args) {


        int[] arr1 = {5,1,4,4};
        int[] arr2 = {9,7,7,7};
        int[] arr3= new int[arr1.length+1];
        int i=0 ,carry = 0,sum=0;
       while(i<arr1.length){
           if(arr1.length== arr2.length){
               sum=arr1[i]+arr2[i]+carry;
               arr3[i]=sum%10;
               carry=sum/10;

           }
           i++;
       }
         arr3[i]=carry;
       for(int j=0;j<=i;j++){
           System.out.print(arr3[j]);
       }
        System.out.println("");
    }
}