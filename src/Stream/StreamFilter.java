package Stream;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args){
        ArrayList<String> list =new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ccc");
        ArrayList<String> list2 =new ArrayList<>();
        list2.add("aaa");
        list2.add("bbb");
        list2.add("ccc");
        list2.add("ddd");
//        list.stream().filter(//过滤条件
//                new Predicate<String>() {
//                    @Override
//                    public boolean test(String s) {
//                        boolean result = s.startsWith("a");
//                        return result;
//                    }
//                }
//        ).forEach(s -> System.out.println(s));//过滤完遍历输出
//lamdba
//        list.stream().filter(
//                (String s)->{
//                    boolean result = s.startsWith("a");
//                        return result;
//                }
//        ).forEach(s -> System.out.println(s));
        //  简化lamdba
       // list.stream().filter(s -> s.startsWith("a")).forEach(s -> System.out.println(s));//s表示流中的每一个数据
    //list.stream().limit(3).forEach(s -> System.out.println(s));
    //list.stream().skip(2).forEach(s -> System.out.println(s));

        //两个stream合并
//        Stream<String> stream1 = list.stream();
//        Stream<String> stream2 = list2.stream();
//
//        Stream<String> stream = Stream.concat(stream1, stream2);
//
//        stream.forEach(s -> System.out.println(s));

        //去重
        //list.stream().distinct().forEach(s -> System.out.println(s));
        //返回个数
        long count = list.stream().count();
        System.out.println(count);
    }
}
