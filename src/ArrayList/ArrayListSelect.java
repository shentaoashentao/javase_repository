package ArrayList;

import domain.Student;

import java.util.ArrayList;

public class ArrayListSelect {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        //有参构造
        Student stu1=new Student("aaa",10);
        Student stu2=new Student("bbb",17);
        Student stu3=new Student("ccc",20);
        //把信息传入list中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        //定义新集合 该集合调用了getList方法（有信息的list作为参数）
        ArrayList<Student> newList =getList(list);
        //集合遍历
        for (int i = 0; i < newList.size(); i++) {
            Student stu=newList.get(i);
            System.out.println(stu.getName()+".."+stu.getAge());
        }

    }

    public static ArrayList<Student> getList(ArrayList<Student> list) {
        //方法内定义新集合 存储筛选出来的学生对象
        ArrayList<Student> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            int age = stu.getAge();//把年龄小于18的放进newList
            if (age < 18) {
                newList.add(stu);
            }
        }
        return newList;
    }
}
