package DataSource.C3P0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/*
    c3p0：数据库连接池技术
     步骤：
        1.导入jar包
        2.定义配置文件：
            名称:c3p0.properties 或者 c3p0-config.xml 不要忘记导入数据库的驱动jar包
            路径：直接将文件放在src目录下即可
        3.创建核心对象 数据库连接池对象 ComboPooledDataSource
        4.获取连接：getConnection
 */
public class C3P0Test01 {
    public static void main(String[] args) throws SQLException {
        //1.创建数据库连接池对象
        DataSource ds = new ComboPooledDataSource();
        //2.获取连接对象
        Connection conn = ds.getConnection();

        //3.打印
        System.out.println(conn);

    }
}
