package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
    JDBC快速入门
    *步骤：
        1.导入驱动jar包
        2.注册驱动
        3.获取数据库连接对象Connection
        4.定义sql
        5.获取执行sql语句的对象Statement
        6.执行sql，接受返回结果
        7.处理结果
        8.释放资源

     *详解各个对象
       1.DriverManager：驱动管理对象
       2.Connection：数据库连接对象
       3.Statement：执行sql的对象
       4.ResultSet：结果集对象
       5.PreparedStatement：执行sql的对象
 */
public class JDBCTest01 {
    public static void main(String[] args) throws Exception {
        //1.导入驱动jar包
        //1.复制jar包到项目的libs目录下
        //2.右键-->add as Library
        //2.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //3.获取数据库连接对象
//        Connection conn = DriverManager.getConnection("jdbc.properties:mysql://localhost:3306/colour_cold?serverTimezone=GMT%2B8", "root", "123456");
        Connection conn = DriverManager.getConnection("jdbc:mysql:///colour_cold?serverTimezone=GMT%2B8", "root", "123456");

        //4.定义sql语句
        String sql = "update emp set salary = 10 where id = 6";
        //5.获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();
        //6.执行sql
        int count = stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        stmt.close();
        conn.close();
    }
}
