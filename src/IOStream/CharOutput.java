package IOStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharOutput {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("E:\\Code\\02\\Project\\javase\\a.txt");
        //fileWriter.write("c");


        char[] cbuf = {97,98,99,100};
//        fileWriter.write(cbuf);
        fileWriter.write(cbuf,1,2);

        fileWriter.close();
    }

}
