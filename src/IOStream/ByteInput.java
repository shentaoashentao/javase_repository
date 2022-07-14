package IOStream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteInput {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("E:\\Code\\02\\Project\\javase\\a.txt");

        //int read = fileInputStream.read();

//        while (true) {
//            int read = fileInputStream.read();
//            System.out.println(read);
//        }

        int b;
        while ((b=fileInputStream.read())!=-1){
            System.out.println(b);
        }
        fileInputStream.close();

    }
}
