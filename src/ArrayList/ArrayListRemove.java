package ArrayList;

import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("aaa");
        list.add("aaa");
        for (int i = 0; i < list.size(); i++) {
            String s=list.get(i);
            if("aaa".equals(s)){   //反过来写不会出现空指针
                list.remove(i);//根据索引删
                i--;//0号位置删了以后 1号位置的元素 补到了0号 所以如果出现连续两个需要删除的就需要i--
            }
        }
    }
}
