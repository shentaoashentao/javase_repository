package Junit;

public class UserService {
    public String loginName(String loginName , String passWord){
        System.out.println("aaaa");
        if("admin".equals(loginName) && "123456".equals(passWord)){
            return "登陆成功";
        }else{
            return "登录名或账号有问题";
        }

    }

    public void selectName(){
        //System.out.println(10/0);
        System.out.println(10/2);
        System.out.println("查询成功");
    }
}
