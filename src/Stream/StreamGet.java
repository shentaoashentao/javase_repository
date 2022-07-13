package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

//Stream流获取
public class StreamGet {
    public static void main(String[] args){
        //Method1();//单列集合
        //Method2();//双列集合
        //Method3();//数组
        //Method4();//同种数据类型的多个数据 stream.of
    }

    private static void Method4() {
        Stream.of(1,2,3,4,5).forEach(s->System.out.println(s));
    }

    private static void Method3() {
        int [] arr = {1,2,3,4,5};
        Arrays.stream(arr).forEach(s->System.out.println(s));
    }

    private static void Method2() {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("aaa",111);
        hashMap.put("bbb",222);
        hashMap.put("ccc",333);

        //双列集合不可以直接获取Stream流
        //1.keySet 先获取键的集合
        hashMap.keySet().stream().forEach(s -> System.out.println(s));
        System.out.println("======");
        //2.entrySet 先获取键值对对象
        hashMap.entrySet().stream().forEach(s -> System.out.println(s));//打印一对
    }

    private static void Method1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        // Stream<String> stream =list.stream();//返回的是stream对象
        list.stream().forEach(s ->System.out.println(s) );
    }
}
