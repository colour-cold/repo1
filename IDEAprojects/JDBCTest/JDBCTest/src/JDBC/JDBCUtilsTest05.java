package JDBC;
/*
    演示JDBC工具类
 */

import java.sql.*;

public class JDBCUtilsTest05 {
    public static void main(String[] args) {
        //练习：在emp表中查询数据
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
//            conn = DriverManager.getConnection("jdbc:mysql:///colour_cold?serverTimezone=GMT%2B8", "root", "123456");
            conn = JDBCUtils05.getConnection();
            statement = conn.createStatement();
            rs = statement.executeQuery("select * from emp");
            //循环判断游标是否是最后一行末尾
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double salary = rs.getDouble(4);
                System.out.println(id + "+" + name + "+" + salary);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils05.close(rs, statement, conn);
        }
        //statement.close();
        //为了避免空指针异常
          /*  if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }*/
    }
}

