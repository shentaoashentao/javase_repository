package JDBC;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mysql.jdbc.log.Log;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @ClassName
 * @Description 使用Druid作为数据源的JDBC操作，通用的操作见DbUtils封装
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Slf4j
public class DruidUtils {

    private static DruidDataSource dataSource = null;
    private static Connection connection = null;
    // 在静态代码块中初始化参数
    static {
        //创建Properties集合
        Properties prop = new Properties();
        InputStream instream = null;
        try {
             //instream = Resources.getResourceAsStream("druid.properties");
            //获取系统加载器
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            //会指定要加载的资源路径与当前类所在包的路径一致。参数是文件的路径  返回的是字节流
            instream = systemClassLoader.getResourceAsStream("druid.properties");
            //打印日志
            log.info("获取到输入流:" + instream.toString());
            //判断有没有根据文件 拿到字节流
            Boolean flag = (instream == null);
            log.error("使用Resources得到的instream为空:" + flag);

            ClassLoader classLoader = DruidUtils.class.getClassLoader();
            //instream = classLoader.getSystemResourceAsStream("resources/druid.properties");
            if (instream == null){
                log.info("未读取到druid.properties文件，系统自定义Druid设置");
                prop.setProperty("driverClassName","com.mysql.jdbc.Driver");
                prop.setProperty("url","jdbc:mysql://127.0.0.1:3306/db01?useSSL=false&Unicode=true&characterEncoding=utf8");
                prop.setProperty("username","root");
                prop.setProperty("password","root");
     /*           prop.setProperty("initialSize","5");
                prop.setProperty("maxActive","10");
                prop.setProperty("maxWait","3000");*/
            }else {
                //打印
                log.info("读取到druid.properties文件");
                //将文件中的数据读取到集合中
                prop.load(instream);
            }
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(prop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DruidDataSource getDataSource(){
        return dataSource;
    }

    public static Connection getConnection(){
        try {
            // 从数据池中获取连接
            connection = dataSource.getConnection();
            if (null == connection){
                log.info(connection + "是空的");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(Connection connection){
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}