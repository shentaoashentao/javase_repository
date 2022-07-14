package IOStream;

import java.io.FileReader;
import java.io.IOException;

//字符输入流
public class CharInput {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("E:\\Code\\02\\Project\\javase\\a.txt");

//        //读取要循环
//        int b;
//        while ((b=fileReader.read()) != -1){
//            System.out.println((char) b);
//        }
//
//        fileReader.close();

        //一次读多个 把多个字符放数组里面
        char[] chars = new char[1024];

        int len;
        while ((len=fileReader.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
            //将全部字符数组变为字符串； public String(char[] value, int offset, int count);// 构造方法
        }

        fileReader.close();
    }

}
