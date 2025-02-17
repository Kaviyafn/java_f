public class Array_max {
public static void main(String s[]){
     int arr[]={1,2,3,4,5};
     int max=arr[0];
      for(int i=1;i<arr.length;i++) //finding the max value of whole arr
      {
          if(arr[i]>max)
              max=arr[i];

      }

    System.out.println(max);
    int arr1[]={1,2,3,4,5};
    int max1=arr[0];


    for(int i=1;i<arr1.length;i++)   //finding the second max value
    {
        if(arr[i]>max1)
            max1=arr[i]-1;

    }

    System.out.println(max1);
}

}
