package demo2;

import java.util.ArrayList;

public class fanxing {
    public static void main(String[] args){
        ArrayList list=new ArrayList();
        list.add("moenkang");
        list.add(123);
        for(int i=0;i<list.size();i++){
            Object o=list.get(i);
            System.out.println(o);
        }
        System.out.println("--------");
        ArrayList<String> strlist=new ArrayList<>();//泛型 编译起见来检测里面的元素类型
        strlist.add("moenkang");
        strlist.add("123");
        for(int i=0;i<list.size();i++){
            String s=strlist.get(i);
            System.out.println(s);
        }
    }
}
