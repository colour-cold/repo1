package JDBC;

import java.sql.*;

/*
    ResultSet：结果集对象，封装查询结果
        *boolean next()：游标向下移动一行，判断当前行是否已是最后一行末尾(是否有数据)，如果是，则返回false，如果不是则返回true
        *next()：游标向下移动一行
        *getXxx(参数)：获取参数
                *Xxx：代表数据类型 如：int getInt() , String getString()
                *参数：
                    1.int：代表列的编号，从1开始 如：getString(1)
                    2.String：代表列名称 如：getDouble("balance")
        *注意：
            使用步骤：
                1.游标向下移动一行
                2.判断是否有数据
                3.获取数据
 */
public class JDBCTest03 {
    public static void main(String[] args) {
        //练习：在emp表中查询数据
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///colour_cold?serverTimezone=GMT%2B8", "root", "123456");
            statement = conn.createStatement();
            rs = statement.executeQuery("select * from emp");
            //循环判断游标是否是最后一行末尾
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double salary = rs.getDouble(4);
                System.out.println(id + "+" + name + "+" + salary);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //statement.close();
            //为了避免空指针异常
            if (rs != null) {
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
            }
        }
    }
}
