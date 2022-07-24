package Reflect.myreflect;

import java.lang.reflect.Constructor;

//获取Constructor对象
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //method1();
        //method2();
        //method3();
        method4();

    }

    private static void method4() throws ClassNotFoundException, NoSuchMethodException {
        //返回单个构造方法对象 公有私有都可以
        Class clazz = Class.forName("Reflect.myreflect.Student");
        Constructor constructor = clazz.getDeclaredConstructor(String.class);
        System.out.println(constructor);
    }

    private static void method3() throws ClassNotFoundException, NoSuchMethodException {
        Class clazz = Class.forName("Reflect.myreflect.Student");
        //Constructor<T> getConstructor();//返回  单个  公共构造方法对象

        //clazz.getConstructor()的括号中 要和构造方法的形参保持一致
       /* Constructor constructor1 = clazz.getConstructor();//输出没有参数的
        System.out.println(constructor1);*/

        Constructor constructor2 = clazz.getConstructor(String.class,int.class);
        System.out.println(constructor2);
    }


    private static void method2() throws ClassNotFoundException {
        //1.获取Class对象
        Class clazz = Class.forName("Reflect.myreflect.Student");
        //Constructor<T> getDeclaredConstructors();//返回所有的构造方法对象的数组
        //输出所有的
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }

    private static void method1() throws ClassNotFoundException {
        //1.获取Class对象
        Class clazz = Class.forName("Reflect.myreflect.Student");
        //Constructor<?>[] getConstructors();  返回所以公共构造方法对象的数组
        //输出看不到私有的 只有两个公有的
        Constructor[] constructors=clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }
}
