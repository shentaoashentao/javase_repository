package demo4;
//类型通配符
public class Test4 {
    public static void main(String[] args){
        Box<Number> box1=new Box<>();
        box1.setFirst(100);
        showBox(box1);
    }
//    public static void showBox(Box<Number> box){
//        Number first=box.getFirst();
//        System.out.println(first);
//    }
//
    public static void showBox(Box<?> box){//?通配符 来代替实参
        Object first=box.getFirst();
        System.out.println(first);
    }
}
