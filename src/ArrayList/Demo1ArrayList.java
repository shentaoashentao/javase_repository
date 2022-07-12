package ArrayList;

import java.util.ArrayList;

public class Demo1ArrayList {
    public static void main(String[] args) {

    }

    private static void TestGet() {
        //1.创建集合
        ArrayList<String> list = new ArrayList<>();
        //2.调用add方法添加数据
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("111");
        list.add("222");
        //查询
        String str=list.get(1);
        Integer size=list.size();
        System.out.println(size);
    }

    private static void TestSet() {
        //1.创建集合
        ArrayList<String> list = new ArrayList<>();
        //2.调用add方法添加数据
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("111");
        list.add("222");
        //list.add(2,"ddd");//插队
        String str =list.set(0,"fff");
        //修改
        System.out.println(str);
        System.out.println(list);
    }

    private static void TestRemove() {
        //1.创建集合
        ArrayList<String> list = new ArrayList<>();
        //2.调用add方法添加数据
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("111");
        list.add("222");
        //list.add(2,"ddd");//插队
        //删除
        //public boolean remove(Object o)
        boolean b1 = list.remove("aaa");//根据值删除
        boolean b2 = list.remove("ddd");//没ddd就false
        String b3 = list.remove(1);//根据索引删除  返回被删除的元素
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println(list);
    }
}
