package IOStream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//键盘输入用户名密码 保存到本地文件
public class CharStreamTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入用户名");
        String name = scanner.next();
        System.out.println("输入密码");
        String password = scanner.next();

        FileWriter fileWriter = new FileWriter("E:\\Code\\02\\Project\\javase\\a.txt") ;

        fileWriter.write(name);
        fileWriter.write("\r\n");
        fileWriter.write(password);

        fileWriter.close();

    }
}
