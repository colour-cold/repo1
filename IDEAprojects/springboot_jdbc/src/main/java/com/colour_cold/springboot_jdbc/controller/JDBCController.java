package com.colour_cold.springboot_jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Map;

@RestController
public class JDBCController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    //查询单条数据
    @RequestMapping("/selectUser/{id}")
    public Map<String,Object> selectUser(@PathVariable("id") int id) {
        Map<String, Object> map = jdbcTemplate.queryForMap("select * from emp where id = " + id);
        return map;
    }

    //查询数据库的所有信息
    //没有实体类，数据库中的东西利用map获取
    @RequestMapping("/userList")
    public List<Map<String,Object>> list() {
        String sql = "select * from emp";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @RequestMapping("/userAdd")
    public String addUser() {
        String sql = "insert into emp(id,name,gender) values(8,'happy','女')";
        jdbcTemplate.update(sql);
        return "userAdd ok";
    }

    @RequestMapping("/updateUser/{id}")
    public String updateUser(@PathVariable("id") int id) {
        String sql = "update emp set id = ?,name = ? where id =" + id;
        Object[] objects = new Object[2];
        objects[0] = 11;
        objects[1] = "小明";
        jdbcTemplate.update(sql,objects);
        return "updateUser ok";
    }

    @RequestMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        String sql = "delete from emp where id = ?";
        jdbcTemplate.update(sql,id);
        return "deleteUser ok";
    }

}
