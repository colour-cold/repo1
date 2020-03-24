package JDBC;

import java.sql.*;
import java.util.*;

/*
    通过键盘录入用户名和密码，判断登录是否成功
    方法一为普通statement
    方法二为PreparedStatement
    当使用方法一输入密码密码为x（xx or 连接一个为true的值） 则会无视之前输入的账号和密码
    所以：
        解决sql注入问题：使用preparedStatement对象来解决
        预编译的SQL：参数使用?作为占位符
        步骤:
            1.导入驱动jar包
            2.注册驱动
            3.获取数据库连接对象Connection
            4.定义sql
                *注意：sql的参数使用?作为占位符。如：select * from user where username = ? and password = ?;
            5.获取执行sql语句的对象PreparedStatement Connection。preparedStatement(String sql)
            6.给?占位符赋值：
                方法：setXxx(参数1，参数2)
                    参数1：?的位置编号，从1开始
                    参数2：?的值
            7.执行sql，接受返回结果，不需要传递sql语句
            8.处理结果
            9.释放资源
        注意：后期都会使用PreparedStatement来完成增删改查的所有操作
            1.可以防止SQL注入
            2.效率更高
 */
public class JDBCCase_Login06 {
    public static void main(String[] args) {

        //键盘输入用户名和密码
        Scanner s1 = new Scanner(System.in);
        System.out.println("输入账号:");
        String user = s1.nextLine();
        Scanner s2 = new Scanner(System.in);
        System.out.println("输入密码:");
        String password = s2.nextLine();

        //连接数据库判断是否成功
        boolean flg = method02(user, password);
        if (flg) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }

    public static boolean method01(String username, String password) {
        //获取连接
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils05.getConnection();
            stmt = conn.createStatement();
            //执行查询
            rs = stmt.executeQuery("select * from user where username = '" + username + "' and password = '" + password + "'");
            //判断
            return rs.next();//如果有下一行返回true
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils05.close(rs, stmt, conn);
        }
        return false;
    }

    //使用preparedStatement对象
    public static boolean method02(String username, String password) {
        //获取连接
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils05.getConnection();
            pstmt = conn.prepareStatement("select * from user where username = ? and password = ?");
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            //执行查询
            rs = pstmt.executeQuery();
            //判断
            return rs.next();//如果有下一行返回true
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils05.close(rs, pstmt, conn);
        }
        return false;
    }
}
