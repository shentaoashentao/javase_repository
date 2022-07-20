package Net.UDP;

import javax.imageio.IIOException;
import java.io.IOException;
import java.net.*;

/*1.创建发送端的Socket对象(DatagramSocket)
2.创建数据，把数据打包
3.调用DatagramSocket对象的方法发送数据
4.关闭发送端*/
public class SendUDP {
    public static void main(String[] args) throws  IOException {
        //创建发送端对象
        DatagramSocket ds = new DatagramSocket();
        //创建数据 打包
        //DatagramPacket(byte[] buf, int length,InetAddress address,int port)
        //构造一个数据包 发送   长度为length   的数据包到     指定主机    上的    指定端口号
        byte[] bytes = "wowowowowo".getBytes(); //一个字符串转化为一个字节数组byte[]的方法
        int length = bytes.length;
        InetAddress address = InetAddress.getByName("192.168.3.157");
        int port = 10086;

        DatagramPacket dp = new DatagramPacket(bytes,length,address,port);
        //调用DatagramSocket对象的方法发送数据
        //void send(DatagramSocket p)
        ds.send(dp);

        //关闭发送端
        ds.close();
    }
}
