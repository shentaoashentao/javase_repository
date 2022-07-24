package JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import SLF4J.HelloSLF4J;
import lombok.extern.slf4j.Slf4j;

import com.mysql.jdbc.PreparedStatement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pojo.User;

public class DbUtilsTest {
    public static void main(String[] args) throws Exception {
        Connection connection = DbUtils.getMySqlConnection();

        Class<User> clazz = User.class;
        String sql = "select * from account";
        ArrayList<User> arrayList = DbUtils.getAll(clazz, sql, connection);

        for (User user : arrayList) {
            System.out.println(user);
        }
        //System.out.println(arrayList);

        //exec
        /*String sql = "DELETE from account where id = 2";
        int i = DbUtils.exec(sql,connection);*/
    }
}
