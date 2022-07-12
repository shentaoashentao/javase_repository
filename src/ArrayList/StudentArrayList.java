package ArrayList;

import domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList {
    public static void main(String[] args){
        //创建集合
        ArrayList<Student> list = new ArrayList<>();
        Student stu1=getStudent();
        Student stu2=getStudent();
        Student stu3=getStudent();
        //加到集合中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.println(stu.getName()+"......"+stu.getAge());
        }

    }

    private static Student getStudent() {
        //键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("输入学生姓名：");
        String name=sc.next();

        System.out.println("输入学生年龄");
        int age =sc.nextInt();
        //创建学生对象 把键盘输的录进去

        Student stu = new Student(name,age);
        return stu;
    }
}
