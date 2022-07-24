package JDBC;

import java.sql.*;

//添加 inser into
public class JDBC_Add {
    public static void main(String[] args) throws Exception  {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://127.0.0.1:3306/db01?useSSL=false&Unicode=true&characterEncoding=utf8";
        String username="root";
        String password="root";
        Connection connection = DriverManager.getConnection(url,username,password);
        //接受提交参数
        String Name="aaaaaa";
        double money=200;

        //定义sql
        String sql = "INSERT into account(Name,money) values(?,?)";
        //获取statement对象
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //设置参数
        preparedStatement.setString(1,Name);
        preparedStatement.setDouble(2,money);

        //执行sql
        int count = preparedStatement.executeUpdate();//不是查询 不用query 所以是update

        System.out.println(count>0);//返回true false

        //resultSet.close();
        preparedStatement.close();
        connection.close();

    }
}
