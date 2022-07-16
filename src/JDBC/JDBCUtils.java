package JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//封装工具类
public class JDBCUtils {
    //封装加载驱动
    static {

        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //封装连接
    public static String url="jdbc:mysql://127.0.0.1:3306/db01?serverTimezone=UTC";
    public static String username="root";
    public static String password="root";

    public static Connection getConn(){
        Connection connection=null;//考虑到try第一下就出问题 导致return不了
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    //通用增删改封装
/*
            函数名 update()
            参数：
            增删改查的sql语句
            sql语句中的？（占位符）  先用数组表示
            返回值：
            因为是增删改 使用executeUpdate() 返回的是影响的行数
            返回值可以是1 -1
 */
    public  static int update(String sql,Object... params){
        Connection connection=getConn();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            if(params != null){
                for (int i = 0; i < params.length; i++) {
                    preparedStatement.setObject(i+1,params[i]);//设置参数放值  params[i]指的是对应？设置的值
                }
            }
            return preparedStatement.executeUpdate();//设置完值以后 执行sql 出来的是行数
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            closeAll(null,preparedStatement,connection);
        }
        return -1;
    }

    /*
    通用查询  多条
    函数名 queryList()
            参数：
            增删改查的sql语句
            sql语句中的？（占位符）  先用数组表示  Object... params
            返回值：查询结果
     */
    public static List<List> queryList(String sql, Object... params){//第二个参数调用时可写可不写
        Connection connection=getConn();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            if(params != null){
                for (int i = 0; i < params.length; i++) {
                    preparedStatement.setObject(i+1,params[i]);//设置参数放值  params[i]指的是对应？设置的值
                }
            }
            resultSet = preparedStatement.executeQuery();//执行sql

            //获取表的原数据信息
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            ArrayList<List> lists = new ArrayList<>();//lists用于存储数据表中所有数据
            while (resultSet.next()){
                ArrayList<Object> list = new ArrayList<>();//list用于存储每行数据
                //把每一行中的每一个数据 都放到list中
                for (int i = 0; i < resultSetMetaData.getColumnCount(); i++) {
                    list.add(resultSet.getObject(i+1));
                }
                //list放lists中
                lists.add(list);
            }
            return lists;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(resultSet,preparedStatement,connection);
        }
        return null;
    }

    /*
      封装close
      方法名：closeAll();
      参数：ResultSet resultset ,PreparedStatement preparedStatement,Connection connection
      返回：不需要
     */
    public static void closeAll(ResultSet resultset ,PreparedStatement preparedStatement,Connection connection){
        try {
            if (resultset != null)
                resultset.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (preparedStatement != null)
                preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
