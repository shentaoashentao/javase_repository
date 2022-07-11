package Arrays;
import java.util.Arrays;
public class GetArray {

        public static void main(String[] args) {

            //int[] a=new int[5];
            int[] a={0,8,5,2,9};
            int i=Arrays.binarySearch(a,2);
            System.out.println(i);
           // int[] b;
           // b=Arrays.copyOf(a,a.length);
           // b=Arrays.copyOfRange(a,2,4);
            //test(b);
            //a[0]=1;
            //fill(a,x)  填充a中的每个都为x
           // Arrays.fill(a,8);
            //test(a);
            //Arrays.fill(a,0,3,7);//(a,b,c,d) 区间[b,c)
            //Arrays.sort(a);
        }
        public static void test(int[] a){
            //for(int a:b) 从数组b依次取出元素赋值给整形变量a
            for(int x:a){//for输出
                System.out.println(x);
            }
        }
}