package Net;

import java.net.InetAddress;
import java.net.UnknownHostException;
/*public static InetAddress getByName(String host) 确定主机名称的IP地址 主机名称可以是机器名称也可以是IP地址
public String getHostName()  获取此IP地址的主机名
public String getHostAddress()  返回文本显示中的IP地址字符串*/
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("192.168.3.157");

        String name = address.getHostName();//获取此IP地址的主机名

        String ip = address.getHostAddress();//返回文本中显示的IP地址字符串

        System.out.println("主机名+" + name);
        System.out.println("ip地址+" + ip);
    }


}
