package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_Update {
    public static void main(String[] args) throws Exception  {
        String url="jdbc:mysql://127.0.0.1:3306/db01?useSSL=false";
        String username="root";
        String password="root";
        Connection connection = DriverManager.getConnection(url,username,password);
        //接受提交参数
        int id = 5;
        String Name="gggg";
        double money=200;

        //定义sql
        String sql = "UPDATE account\n" +
                "SET name=?,\n" +
                "money=?\n" +
                "WHERE id= ?";
        //获取statement对象
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //设置参数  根据？
        preparedStatement.setString(1,Name);
        preparedStatement.setDouble(2,money);
        preparedStatement.setInt(3,id);

        //执行sql
        int count = preparedStatement.executeUpdate();//不是查询 不用query 所以是update

        System.out.println(count>0);//返回true false

        //resultSet.close();
        preparedStatement.close();
        connection.close();

    }
}
