package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //获取连接
       // DriverManager.getConnection(url,urlname,password);
        String url="jdbc:mysql://127.0.0.1:3306/db01?useSSL=false";
        String username="root";
        String password="root";
        Connection connection = DriverManager.getConnection(url,username,password);

        //获取sql执行的对象 statement
        Statement statement = connection.createStatement();


        //定义SQL语句
        String sql1="UPDATE tb_book set price=100 WHERE bookid = 1";
        String sql2="UPDATE tb_book set price=100 WHERE bookid = 2";


        try {

            connection.setAutoCommit(false);//开启事务
            int count1= statement.executeUpdate(sql1); //返回的是影响条数
            System.out.println(count1);

            int count2= statement.executeUpdate(sql2);
            System.out.println(count2);

            connection.commit();//提交事务
        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
        }

        statement.close();
        connection.close();


    }
}
