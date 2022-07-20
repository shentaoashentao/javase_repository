package Net.Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//UDP发送数据 数据来源于键盘输入 输入到886时 发送数据结束
public class SendDemo {
    public static void main(String[] args)  throws IOException {
        DatagramSocket ds = new DatagramSocket();

        //封装键盘输入的数据
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String line;
        while ((line= br.readLine()) != null ) {
            if ("886".equals(line)) {
                break;
            }

            //创建数据 并打包
            byte[] bytes = line.getBytes(); //一个字符串转化为一个字节数组byte[]的方法
            int length = bytes.length;
            InetAddress address = InetAddress.getByName("192.168.3.157");
            int port = 11111;

            DatagramPacket dp = new DatagramPacket(bytes, length, address, port);

            ds.send(dp);
        }
        ds.close();
    }
}
