package JDBC;

import java.sql.*;

/*
    DriverManager：驱动管理对象
        *功能：
            1.注册驱动：高速程序该使用哪一个数据库驱动jar
                static void registerDriver(Driver driver)：注册与给定的驱动程序DriverManager。
                写代码使用:Class.forName("com.mysql.jdbc.properties.Driver");
                通过查看源码发现：在com.mysql.jdbc.properties.Driver类中存在静态代码块
                    static{
                        try{
                            java.sql.DriverManager.registerDriver(new Driver());
                        }catch(SQLException E) {
                            throw new RuntimeException("Can't register driver!");
                        }
                    }
                    注意：mysql5之后的驱动jar包可以省略注册驱动的步骤

             2.获取数据库连接:
                *方法：static Connection getConnection(String url,String user,String password)
                *参数:
                    url：指定连接的路径
                        Ⅰ.语法：jdbc.properties:mysql://ip地址(域名):端口号/数据库名称
                        Ⅱ.例子：jdbc.properties:mysql://localhost:3306/colour_cold
                        Ⅲ.细节：如果连接的是本机的mysql服务器，并且mysql服务器默认端口是3306，则urk可以简写为：jdbc.properties:mysql///数据库名称
                        Ⅳ.user：用户名
                        Ⅴ.password：密码
    Connection：数据库连接对象
        *功能：
            1.获取执行sql的对象
                *Statement createStatement()
                *PreparedStatement prepareStatement(String sql)
            2.管理事务：
                *开启事务：setAutoCommit(boolean autoCommit)：调用该方法设置参数为false，即开启事务
                *提交事务：commit()
                *回滚事务：rollback()
    Statement：执行sql对象
        1.执行sql
            *boolean execute(String sql)：可以执行任意的sql 了解
            *int executeUpdate(String sql)：执行DML(insert、update、delete)语句、DDL(create、alter、drop)语句
            *ResultSet executeQuery(String sql)：执行DQL(select)语句

    ResultSet：结果集对象
 */
public class JDBCTest02 {
    public static void main(String[] args) {
        //练习：在emp表中添加一条记录
 /*       Connection conn = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.properties.Driver");
            conn = DriverManager.getConnection("jdbc.properties:mysql:///colour_cold?serverTimezone=GMT%2B8", "root", "123456");
            statement = conn.createStatement();
            int count = statement.executeUpdate("insert into emp (name,gender,salary) values('如来佛','男',100000)");
            System.out.println(count);
            if(count > 0) {
                System.out.println("添加成功");
            }else {
                System.out.println("添加失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //statement.close();
            //为了避免空指针异常
            if(statement != null) {
                try{
                    statement.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
             if(conn != null) {
                try{
                    conn.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }*/

        try (Connection conn = DriverManager.getConnection("jdbc.properties:mysql:///colour_cold?serverTimezone=GMT%2B8", "root", "123456");
             Statement statement = conn.createStatement();
        ) {
            int count = statement.executeUpdate("insert into emp (name,gender,salary) values('如来佛','男',100000)");
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
