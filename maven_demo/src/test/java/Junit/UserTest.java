package Junit;
import org.junit.Test;
import pojo.User;

public class UserTest {
    @Test
    public void contextLoads(){
        User user1 = new User();
        user1.setId(1);
       user1.setName("aaa");
       user1.mylog();

        User user2 = new User();
        user2.setId(1);user2.setName("bbb");

        //对象与对象的equals  比较的是地址

        //加了@EqualsAndHashCode 则是比较对象的值  exclude("")  可排除某些值
        System.out.println(user1.equals(user2));
    }
}
