package ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
一个集合内 放多个字符串元素
把“张”开头的放新的集合  "张三" "张四四" "李三"
在新的集合中 挑 长度为3的 在放新的集合
*/
public class ArrayListStream {
    public static void main(String[] args){
        ArrayList<String> list1 = new ArrayList<>(List.of("张三","张四四","李三"));//list.of批量添加
        ArrayList<String> list2 = new ArrayList<>();//放姓张的
        ArrayList<String> list3 = new ArrayList<>();//放姓张的 3个字的

        for (String s : list1) {
            if(s.startsWith("张")){
                list2.add(s);
            }
        }
        for (String s : list2) {
            if(s.length()==3){
                list3.add(s);
            }
        }
        for (String s : list3) {
            System.out.println(s);
        }
        System.out.println("----------");
        //Stream流
        list1.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(s -> System.out.println(s));
    }
}
