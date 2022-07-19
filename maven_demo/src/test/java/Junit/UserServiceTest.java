package Junit;

import junit.framework.TestCase;
import org.junit.*;

public class UserServiceTest {
//ps:1.测试的必须是公开的 无参数 无返回值的方法
//   2.要用@Test标记
    @Before
    public void before(){
        System.out.println("=====before=====");
    }

    @After
    public void after(){
        System.out.println("======after=====");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("=====beforeClass=====");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("======afterClass=====");
    }

    @Test
    public void testLoginName() {
        UserService userService = new UserService();

        String result = userService.loginName("admin","123456");
       //String result= userService.loginName("admin","12456");

        //预期结果的正确性测试  (预期失败提示的消息，期待的消息，实际值)
        Assert.assertEquals("你的业务可能出错","登陆成功",result);

    }
    @Test
    public void testSelectName() {
        UserService userService = new UserService();
        userService.selectName();
    }
}