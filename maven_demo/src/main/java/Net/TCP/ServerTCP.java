package Net.TCP;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*1.创建服务器端的Socket对象(ServerSocket)
2.获取输入流 读数据 把数据显示在控制台
3.释放资源*/
public class ServerTCP {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(16666);
        //Socket accept()  侦听要连接到此  套接字  并接受他
        //
        Socket s = ss.accept();

        //获取输入流 读数据 把数据显示在控制台
        InputStream is = s.getInputStream();
        //字节流读数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        //把数据转换为字符串
        String data = new String(bytes,0,len);
        System.out.println("数据是："+data);

        s.close();;
        ss.close();
    }
}
