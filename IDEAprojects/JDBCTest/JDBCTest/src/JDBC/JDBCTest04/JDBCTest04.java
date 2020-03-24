package JDBC.JDBCTest04;
/*
    JDBC 定义一个方法，查询emp表的数据将其封装为对象，然后装载集合，返回。
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class JDBCTest04 {
    public static void main(String[] args) {
        List<Emp> list = method();
        System.out.println(list);
    }

    public static List<Emp> method() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Emp> list = null;
        Emp emp = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql:///colour_cold?serverTimezone=GMT%2B8", "root", "123456");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from emp");
            list = new ArrayList();
            while (rs.next()) {
                emp = new Emp();
                emp.setId(rs.getInt(1));
                emp.setName(rs.getString(2));
                emp.setSalary(rs.getInt(4));
                list.add(emp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
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
                if (list != null) {
                    return list;
                }
            }
        }
        return null;
    }
}
