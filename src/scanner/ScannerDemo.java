package scanner;


import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args){
        //键盘录入技术
        Scanner sc=new Scanner(System.in);//得到一个键盘扫描器对象


        System.out.println("请你输入年龄：");

        int age=sc.nextInt();//调用sc对象的功能等待接受用户输入的数据，这个代码会等待用户输入数据，直到输入完数据按下回车就会把数据拿到
        System.out.println("您的年龄是："+age);


    }
}
