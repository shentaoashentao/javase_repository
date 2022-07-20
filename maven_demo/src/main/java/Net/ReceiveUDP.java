package Net;

import javax.imageio.IIOException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*1.创建接收端Socket对象
2.创建一个数据包，用于接收数据
3.调用DatagramSocket对象的方法接收数据
4.解析数据包，并把数据在控制台内显示
5.关闭接收端*/
public class ReceiveUDP {
    public static void main(String[] args) throws IOException {
        //创建 接收端  Socket对象
         //DatagramSocket(int port) 构造数据套 并将其绑定到本地主机的指定端口
        DatagramSocket ds = new DatagramSocket(10086);//接收端的Socket对象
        //创建数据包 用于接收数据
        //DatagramPacket(byte[] buf, int length) 构造一个DatagramPacket用于接收长度为length数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        //调用DatagramSocket对象的方法接收数据
        ds.receive(dp);
        //解析数据包，并把数据在控制台内显示
        //byte[] getData[]返回数据缓冲区
        byte[] datas = dp.getData();

        int len = dp.getLength();//返回发送的数据长度
        String dataString = new String(datas,0,len);
        System.out.println("数据是+"+dataString);

        ds.close();
    }
}
