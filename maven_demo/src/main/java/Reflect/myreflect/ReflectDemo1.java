package Reflect.myreflect;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {

        //1.Class类中的静态方法ForName("全类名")   全类名=包名+类名
        Class clazz1 = Class.forName("Reflect.myreflect.Student");
        System.out.println(clazz1);

        //2.通过class属性来获取
        Class clazz2 = Student.class;
        System.out.println(clazz2);

        //3.通过对象的getClass方法获取对象
        Student student = new Student();
        Class clazz3 = student.getClass();
        System.out.println(clazz3);
    }
}
