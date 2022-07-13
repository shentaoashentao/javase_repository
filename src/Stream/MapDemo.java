package Stream;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args){
        //创建对象
        Map<String,String> map = new HashMap<>();
        //往里面加对象 put（K key ，V value）
        map.put("001","aaa");
        map.put("002","bbb");
      //  map.put("002","ccc"); //key原来有了 会把Value覆盖掉
       // map.remove("002");
        //map.clear();
       // String str1 = map.get("001");
       // Set<K> keySet()//获取所有键的集合
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
          System.out.println(s);
        }
        Collection<String> values = map.values();//获取所有值的集合
        for (String value : values) {
            System.out.println(value);
        }

        //System.out.println();
    }
}
