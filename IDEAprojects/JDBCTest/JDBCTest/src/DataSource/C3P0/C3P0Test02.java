package DataSource.C3P0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/*
    c3p0演示
 */
public class C3P0Test02 {
    public static void main(String[] args) throws SQLException {
        //1.创建数据库连接池对象,使用默认配置
        DataSource ds1 = new ComboPooledDataSource();

        //2.获取连接对象
        for (int i = 1; i <= 7; i++) {
            Connection conn = ds1.getConnection();
            System.out.println(i + ":" + conn);
            if (i == 3) {
                conn.close();//归还连接到连接池中
            }
        }

        //1.获取DataSource，使用指定名称配置
        ComboPooledDataSource ds2 = new ComboPooledDataSource("otherc3p0");

        //2.获取连接对象
        for (int i = 1; i <= 10; i++) {
            Connection conn = ds2.getConnection();
            System.out.println(i + ":" + conn);
        }
    }
}
