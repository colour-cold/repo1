package DataSource.Druid;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/*
    使用新的工具类
 */
public class DruidTest02 {
    public static void main(String[] args) {
        //完成一个添加的操作,给account表添加一条记录
        //1.获取连接
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = JDBCUtils.getConnection();
            //2.定义sql
            String sql = "insert into account values(null,?,?)";
            //3.获取pstmt对象
            pstmt = conn.prepareStatement(sql);
            //4.给?赋值
            pstmt.setString(1, "王五");
            pstmt.setDouble(2, 1000);
            //执行sql
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(pstmt, conn);
        }
    }
}
