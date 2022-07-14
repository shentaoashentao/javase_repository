package IOStream;

import java.io.UnsupportedEncodingException;
import java.sql.SQLOutput;
import java.util.Arrays;

public class CharStream {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //byte[] getBytes(); 把String转换为字节，结果放到新的字节数组中
        //byte[] getBytes(String charsetName) 指定的编码表转换成字节

        String s="我是莫恩康";//一个中文三个字节
        byte[] bytes = s.getBytes();//idea默认UTF-8
        System.out.println(Arrays.toString(bytes));//没有Array.toString 出来的是地址

        byte[] bytes1 = s.getBytes("UTF-8");//指定特殊的编码格式
        System.out.println(Arrays.toString(bytes));


    }
}
