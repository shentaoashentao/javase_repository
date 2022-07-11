package demo3;

import java.util.ArrayList;
import java.util.Random;

public class ProductGetter<T> {

    private T product;

    Random random=new Random();
    ArrayList<T> list=new ArrayList<>();

     public void addProduct(T t){
         list.add(t);
     }
     public T getProduct(){
         product=list.get(random.nextInt(list.size()));//给定一个参数n，nextInt(n)将返回一个大于等于0小于n的随机数
         return product;
     }
}
