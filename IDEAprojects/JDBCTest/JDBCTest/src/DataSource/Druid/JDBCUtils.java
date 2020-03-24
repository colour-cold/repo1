package DataSource.Druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/*
    Druid连接池的工具类
 */
public class JDBCUtils {
    //1.定义成员变量 DataSource
    private static DataSource ds;

    static {
        //1.加载配置文件
      /*  Properties pro = new Properties();
        InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);*/
        Properties pro = new Properties();
        try {
            pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            //获取DataSource
            try {
                ds = DruidDataSourceFactory.createDataSource(pro);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
        获取连接的方法
     */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    /*
        释放资源的方法
     */
    public static void close(Statement stmt, Connection conn) {
        /*if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }*/
        close(null, stmt, conn);
    }

    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /*
        获取连接池方法
     */
    public static DataSource getDataSource() {
        return ds;
    }
}
