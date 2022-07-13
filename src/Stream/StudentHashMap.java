package Stream;

import domain.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentHashMap {
    public static void main(String[] args){
        Map<String, Student> map = new HashMap<>();
        //创建学生对象
        Student stu1 = new Student("aaa",10);
        Student stu2 = new Student("bbb",11);
        Student stu3 = new Student("ccc",12);
        //学生添加到集合
        map.put("001",stu1);
        map.put("002",stu2);
        map.put("003",stu3);
        //遍历 1.键找值 2.键值对对象找键和值
        //1.键找值 V get(Object key)//根据键获取值 先获取键的集合再去找
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            Student student = map.get(s);
            System.out.println(student.getName()+".."+student.getAge());
        }
            System.out.println("==============");
        //2.键值对对象找键和值
        Set<Map.Entry<String, Student>> entrySet = map.entrySet();//entrySet指找到键值对的集合
        for (Map.Entry<String, Student> stringStudentEntry : entrySet) {
            String key = stringStudentEntry.getKey();
            Student value = stringStudentEntry.getValue();
            System.out.println(key+".."+value.getName()+".."+value.getAge());
        }

    }
}
