package ClassLoader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//用加载器加载指定文件
public class ClassLoaderFile {
    public static void main(String[] args) throws IOException {
        //获取系统加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        //  会指定要加载的资源路径与当前类所在包的路径一致。参数是文件的路径  返回的是字节流
        InputStream resourceAsStream = systemClassLoader.getResourceAsStream("prop.properties");

        Properties properties = new Properties();

        properties.load(resourceAsStream);//从输入流中读取属性列表（键和元素对）

        System.out.println(properties);

        resourceAsStream.close();

    }
}
