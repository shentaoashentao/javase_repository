package demo2;

public class MainClass {
    public static void main(String[] args){

        Generic<String> str=new Generic<>("abc");
        String str1=str.getKey();
        System.out.println(str1);


        Generic generic=new Generic("BAC");
        Object key3=generic.getKey();//没有指定类型就是用 Object类型接受
        System.out.println(key3);
    }
}
