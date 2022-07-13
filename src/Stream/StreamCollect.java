package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollect {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        //把过滤好的数据 放到新的集合内
        List<Integer> collect = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);//list保留重复

        Set<Integer> set = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toSet());
        System.out.println(set);//去重后
    }
}
