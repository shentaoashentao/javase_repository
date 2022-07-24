package Reflect.myreflect;

import lombok.Data;
import lombok.ToString;

@Data

public class Student {
    private String name;
    private int age;
    public  String gender;
    private int money = 1;


    //私有的有参构造方法
    private Student(String name){
        System.out.println("name的值为："+name);
        System.out.println("private....Student..有参构造");
    }
    //公共的无参构造
    public Student(){
        System.out.println("public....Student...无参构造");
    }

    //公共的有参构造
    public Student(String name,int age){
        System.out.println("name的值为："+name+"age的值为："+age);
        System.out.println("public....Student....有参构造方法");
    }


}
