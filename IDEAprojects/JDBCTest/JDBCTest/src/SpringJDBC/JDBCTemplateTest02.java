package SpringJDBC;

import DataSource.Druid.JDBCUtils;
import domain.Emp;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class JDBCTemplateTest02 {
    //Junit单元测试，可以让方法独立执行
    /*
        1.修改1号数据的salary数据为10000
     */

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Test
    public void test01() {
        template.update("update emp set salary = 10000 where id = 1001");
    }

    /*
        2.添加一条记录
     */
    @Test
    public void test02() {
        String sql = "insert into emp(id,ename,dept_id) values(?,?,?)";
        int count = template.update(sql, 1015, "张三", 20);
        System.out.println(count);
    }

    /*
        3.删除刚才添加的记录
     */
    @Test
    public void test03() {
        String sql = "delete from emp where id = ?";
        int count = template.update(sql, 1015);
        System.out.println(count);
    }

    /*
        4.查询id为1的记录，将其封装为map集合
        注意：这个方法查询的结果集只能为1
     */
    @Test
    public void test04() {
        String sql = "select * from emp where id = ?";
        Map<String, Object> map = template.queryForMap(sql, 1001);
        System.out.println(map);
    }

    /*
        5.查询所有记录，将其封装为list集合
     */
    @Test
    public void test05() {
        String sql = "select * from emp";
        List<Map<String, Object>> list = template.queryForList(sql);
        System.out.println(list);
    }

    /*
        6.查询所有记录，将其封装为emp对象的list集合
     */
    @Test
    public void test06() {
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    /*
        7.查询总记录数
     */
    @Test
    public void test07() {
        String sql = "select count(id) from emp";
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);
    }
}
