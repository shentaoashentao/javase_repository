package Reflect.myreflect;

import java.lang.reflect.Field;

//获取field对象
public class ReflectDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        /*Field[] getFields()  返回所以公共成员变量对象的数组
                Field[] getDeclaredFields()  返回所有成员变量对象的数组
            Field getField(String name);  返回单个公共成员变量对象
                Field getDeclareField(String name) 返回单个成员变量对象*/
       // method1();//返回所以公共成员变量对象的数组
       // method2();//返回所有成员变量对象的数组
        //method3();//返回单个公共成员变量对象
        //method4();//返回单个成员变量对象
    }

    private static void method4() throws ClassNotFoundException, NoSuchFieldException {
        Class clazz = Class.forName("Reflect.myreflect.Student");
        //获取Field对象
        Field field = clazz.getDeclaredField("name");
        System.out.println(field);
    }

    private static void method3() throws ClassNotFoundException, NoSuchFieldException {
        Class clazz = Class.forName("Reflect.myreflect.Student");
        //获取Field对象
        Field field = clazz.getField("gender");
        System.out.println(field);
    }

    private static void method2() throws ClassNotFoundException {
        Class clazz = Class.forName("Reflect.myreflect.Student");
        //获取Field对象
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }

    private static void method1() throws ClassNotFoundException {
        Class clazz = Class.forName("Reflect.myreflect.Student");
        //获取Field对象
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}
