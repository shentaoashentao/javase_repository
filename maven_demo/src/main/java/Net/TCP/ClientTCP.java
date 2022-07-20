package Net.TCP;
/*1.创建客户端的Socket对象
2.获取输出流 写数据
3.释放资源*/
import javax.imageio.IIOException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTCP {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        Socket socket = new Socket("192.168.3.157",16666);

        //获取输出流写数据
        //OutputStream  getOutputStream() 返回此套接字的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("tcptcptcp".getBytes());

        socket.close();
    }
}
