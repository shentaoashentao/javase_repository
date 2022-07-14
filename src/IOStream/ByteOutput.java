package IOStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutput {
    public static void main(String[] args) throws IOException {
        //文件不存在会自己创 文件存在会把文件清空再写
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\Code\\02\\Project\\javase\\a.txt");
       // fileOutputStream.write(100);//写的是100对应的字符“d”

        //byte[] bytes={98,99,100,101,102};//一次性写多个时 写进数组

        //fileOutputStream.write(bytes);
        //fileOutputStream.write(bytes,1,2);//截取从off开始的len个

        fileOutputStream.write(97);
        fileOutputStream.write("\r\n".getBytes());
        fileOutputStream.write(98);
        fileOutputStream.write("\r\n".getBytes());
        fileOutputStream.write(99);

        fileOutputStream.close();//没有这个 文件删不掉

    }
}
