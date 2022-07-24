package Reflect.myreflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//获取获取Constructor对象 并创建对象
public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
       // method1();//利用有参方法 创建对象
        //method2();//空参创建对象
        //method3();//空参创建对象 简写
        method4();//私有化构造 创建对象
    }

    private static void method4() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //1.获取Class对象
        Class clazz = Class.forName("Reflect.myreflect.Student");
        //2.获取私有化的构造方法
        Constructor constructor = clazz.getDeclaredConstructor(String.class);

        //因为是私有化 所以必须加上
        constructor.setAccessible(true);
        Student student = (Student)constructor.newInstance("zhangsan");
        System.out.println(student);
    }

    private static void method3() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("Reflect.myreflect.Student");

        Student student = (Student) clazz.newInstance();
        System.out.println(student);
    }

    private static void method2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //1.获取Class对象
        Class clazz = Class.forName("Reflect.myreflect.Student");
        //2.获取构造方法对象
        Constructor constructor = clazz.getConstructor();
        Student student = (Student)constructor.newInstance();
        System.out.println(student);
    }

    private static void method1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //1.获取Class对象
        Class clazz = Class.forName("Reflect.myreflect.Student");
        //2.获取构造方法对象
        Constructor constructor = clazz.getDeclaredConstructor(String.class,int.class);
        //3.利用newInstance 创建Student对象
        Student student = (Student)constructor.newInstance("zhangsan", 23);
        System.out.println(student);
    }
}
