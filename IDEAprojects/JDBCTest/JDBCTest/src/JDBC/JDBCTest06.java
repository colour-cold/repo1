package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
    1.事务：一个包含多个步骤的业务操作。如果这个业务操作被事务管理，则这多个步骤要么同时成功，要么同时失败
    2.操作：
        开启事务:在执行sql前开启事务
        提交事务：当所有sql都执行完提交事务
        回滚事务：在catch中回滚事务
    3.使用Connection对象来管理事务
        开启事务:setAutoCommit(boolean autoCommit)：调用该方法设置参数为false，即开启事务
        提交事务：commit()
        回滚事务：rollback()

        案例事务操作：转账
 */
public class JDBCTest06 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;

        try {
            //1.获取连接
            conn = JDBCUtils05.getConnection();
            //开启事务
            conn.setAutoCommit(false);

            //2.定义sql 张三-500 李四+500
            String sql1 = "update account set balance = balance - ? where id = ?";
            String sql2 = "update account set balance = balance + ? where id = ?";
            //3.获取执行sql对象
            pstmt1 = conn.prepareStatement(sql1);
            pstmt2 = conn.prepareStatement(sql2);
            //4.设置参数
            pstmt1.setDouble(1, 500);
            pstmt1.setInt(2, 1);
            pstmt2.setDouble(1, 500);
            pstmt2.setDouble(2, 2);
            //5.执行sql
            pstmt1.executeUpdate();

            //手动制造异常
            int i = 3 / 0;

            pstmt2.executeUpdate();

            //提交事务
            conn.commit();

        } catch (Exception e) {
            //事务回滚
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            //释放资源
            JDBCUtils05.close(conn, pstmt1);
            JDBCUtils05.close(null, pstmt2);

        }
    }
}
