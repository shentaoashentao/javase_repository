package Reflect.myreflect;

import java.lang.reflect.Field;

//利用field对象 赋值获取值
public class ReflectDemo5 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
      /*  void set(Object obj,Object value) 给obj对象   的   成员变量    赋值为   value
        Object get(Object obj)  返回由该Field表示的字段在指定对象上的值   */

        //method1();//给obj对象   的   成员变量    赋值为   value
       // method2();//返回由该Field表示的字段在指定对象上的值


    }

    private static void method2() throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("Reflect.myreflect.Student");
        //用name获取Field对象
        Field field = clazz.getDeclaredField("money");
        field.setAccessible(true);

        //用get获取值
        //先利用newInstance来创建Student对象
        Student student = (Student) clazz.newInstance();
        //获取指定对象上的值
        Object o =field.get(student);
        System.out.println(o);
    }

    private static void method1() throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("Reflect.myreflect.Student");
        //用name获取Field对象
        Field field = clazz.getField("gender");

        //用set赋值
        //先利用newInstance来创建Student对象
        Student student = (Student) clazz.newInstance();
        //有了对象之后给指定对象赋值
        field.set(student,"aaa");
        System.out.println(student);
    }
}
