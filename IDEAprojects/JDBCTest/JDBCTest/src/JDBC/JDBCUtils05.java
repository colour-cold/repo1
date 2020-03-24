package JDBC;

import java.io.*;
import java.net.URL;
import java.sql.*;
import java.util.Properties;
/*
    抽取jdbc工具类：JDBCUtils
    目的：简化书写
    分析：
        1.注册驱动也抽取
        2.抽取一个方法获取连接对象
            需求：不想传递参数(麻烦)，还得保证工具类的通用性
            解决：配置文件
                jdbc.properties
                    url =
                    user =
                    password =
        3.抽取一个方法释放资源
 */

public class JDBCUtils05 {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    //文件的读取，只需要读取一次即可拿到这些值，使用静态代码块·
    static {
        //读取资源文件，获取值

        try {
            //1.创建Properties集合类
            Properties pro = new Properties();

            //获取【src】路径下的文件方式-->ClassLoader 类加载器
            ClassLoader classLoader = JDBCUtils05.class.getClassLoader();
            URL resource = classLoader.getResource("jdbc.properties");
            String path = resource.getPath();
//            System.out.println(path);
            //2.加载文件
//            pro.load((new FileReader("D:\\IdeaProjects\\JDBCTest\\JDBCTest\\src\\jdbc.properties")));
            pro.load(new FileReader(path));
            //获取数据，赋值
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver = pro.getProperty("DriverManager");
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    //获取连接，返回连接对象
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    //释放资源
    public static void close(ResultSet rs, Statement stmt, Connection conn) {
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
        }
    }

    public static void close(Connection conn, Statement stmt) {

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
        }
    }

    public static void close(Connection conn, PreparedStatement pstmt) {

        if (pstmt != null) {
            try {
                pstmt.close();
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
