package String;
import java.lang.String;
public class GetString {


    public static void main(String[] args){
        String str1="HelloWorld";
        //String str2="World";
        //String str2="World".concat(str1);
         //char str2=str1.charAt(1);
        //int n=str1.lastIndexOf("l");
        String[] str2=str1.split("l ");
       System.out.println(str2);


    }
}
