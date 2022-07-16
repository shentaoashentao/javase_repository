package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//DQL查询语句
public class JDBC_ResultSet {
    public static void main(String[] args) throws Exception  {
        String url="jdbc:mysql://127.0.0.1:3306/db01?useSSL=false";
        String username="root";
        String password="root";
        Connection connection = DriverManager.getConnection(url,username,password);

        String sql = "SELECT * FROM account";

        Statement statement = connection.createStatement();
        //执行sql
        ResultSet resultSet = statement.executeQuery(sql);//查询用executeQuery

        //处理结果 遍历数据
        while (resultSet.next()){//判断当前行有没有数据
            int id= resultSet.getInt(1);
            String name = resultSet.getString(2);
            int money = resultSet.getInt(3);

            System.out.println(id);
            System.out.println(name);
            System.out.println(money);
            System.out.println("=========");


        }
        resultSet.close();
        statement.close();
        connection.close();

    }

}
