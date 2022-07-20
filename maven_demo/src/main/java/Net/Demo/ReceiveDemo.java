package Net.Demo;

import javax.imageio.IIOException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

//接收数据 因为不知道什么时候停止发送 所以采用死循环接受
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(11111);//接收端的Socket对象

        while (true) {
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

            ds.receive(dp);

            System.out.println("数据是+" + new String(dp.getData(), 0, dp.getLength()));

        }
    }
}
