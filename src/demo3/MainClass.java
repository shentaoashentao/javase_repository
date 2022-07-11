package demo3;
//泛型练习
public class MainClass {
    public static void main(String[] args){
        //创建抽奖器对象 指定数据类型 抽奖器名字stringProductGetter
        ProductGetter<String> stringProductGetter=new ProductGetter<>();
        String[] strProducts={"iphone","ipad","iwatch"};
        //把数组中的内容 填充到抽奖器中
        for (int i=0;i<strProducts.length;i++){
            stringProductGetter.addProduct(strProducts[i]);
        }
        //随机抽一个
        String product1 = stringProductGetter.getProduct();

        System.out.println("您获得了"+product1);
    }
}
