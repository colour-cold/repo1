package SpringJDBC;

/*
    Spring JDBC
    Spring框架对于JDBC的简单封装，提供了一个JDBCTemplate对象简化JDBC的开发
    步骤：
        1.导入jar包
        2.创建JDBCTemplate对象。依据于数据源DataSource
            *JDBCTemplate template = new JDBCTemplate(ds);
        3.使用JDBCTemplate的方法来完成CRUD的操作
            update()：执行DML语句。增删改语句
            queryForMap()：查询结果集封装为map集合，将列名作为key，值作为value，将这条记录封装为一个map集合     *注意：这个方法查询的结果集只能为1
            queryForList()：查询结果集将结果集封装为list集合，将每一条记录封装为map集合，再将所有map集合封装为list集合
            query()：查询结果，将结果封装为JavaBean对象
                query的参数：RowMapper
                    *一般我们使用BeanPropertyRowMapper实现类。可以完成数据到JavaBean的自动封装
                    *new BeanPropertyRowMapper<类型>(类型.class)
            queryForObject：查询结果，将结果封装为对象
                *一般用于聚合函数的查询
    练习：
        需求：
            1.修改1号数据的salary为10000
            2.添加一条记录
            3.删除刚才添加的记录
            4.查询id为1的记录，将其封装为map集合
            5.查询所有的记录，将其封装为list
            6.查询所有记录，将其封装为emp对象的list集合
            7.查询总记录数
 */
public class JDBCTemplateTest01 {
}
