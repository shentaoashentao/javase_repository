package JDBC;

import java.util.List;

public class DBTest {
    public static void main(String[] args) {
       //测试增删改
       String sql ="insert into account values(null,?,?)";
        Object[] objects={"shentao",7};

        int i = JDBCUtils.update(sql,objects);
        System.out.println(i);

  /*      //测试查询 多条

        String sql ="select * from account";
        List<List> lists = JDBCUtils.queryList(sql);
        System.out.println(lists);*/

     /*   //测试查询 单条
        String sql ="select * from account where id= ?";
        List<List> lists = JDBCUtils.queryList(sql,1);
        System.out.println(lists);
*/

       /* String sql ="select * from account where name like 's%'";
        List<List> lists = JDBCUtils.queryList(sql);
        System.out.println(lists);*/

  /*      String sql = "DELETE from account where id = 5";
        int i = JDBCUtils.update(sql);
        System.out.println(i);*/

    }
}
