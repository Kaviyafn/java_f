import java.util.Scanner;

public class Extract_substring {


    public void String_object(String str) {
        String sub_s1 = str.substring(0, 4);
        String sub_s2 = str.substring(4);
        System.out.println("s1:" + sub_s1);
        System.out.println("s2:" + sub_s2);
        System.out.println();
    }

    public void String_builder_obj(String str) {

        StringBuilder builder=new StringBuilder(str);
       String s_b1= builder.substring(0,4);
        String s_b2= builder.substring(4);
        System.out.println("s1:" + s_b1);
        System.out.println("s2:" + s_b2);
        System.out.println();
    }

public void String_buffer_obj(String str) {

    StringBuffer buffer=new StringBuffer(str);
    String s_buf1= buffer.substring(0,4);
    String s_buf2= buffer.substring(4);
    System.out.println("s1:" + s_buf1);
    System.out.println("s2:" + s_buf2);
    System.out.println();
}



    public static void main(String[] args) {
        String str = "javaprogramming";
        Extract_substring obj=new Extract_substring();
        System.out.println("this is String object");
        obj.String_object(str);
        System.out.println("this is StringBuilder object");
        obj.String_builder_obj(str);
        System.out.println("this is StringBuffer object");
        obj.String_buffer_obj(str);


    }
}
