package com.colour_cold.springboot.Dao;

import com.colour_cold.springboot.controller.EmployeeController;
import com.colour_cold.springboot.pojo.Department;
import com.colour_cold.springboot.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//员工Dao
@Repository
public class EmployeeDao {
    //模拟数据库中的数据
    private static Map<Integer, Employee> employees = null;
    //员工有所属的部门
    @Autowired
    private DepartmentDao departments = null;

    static {
        employees = new HashMap<>();//创建一个部门表
        employees.put(1,new Employee(1,"江苏XXX公司",1516,156,"江苏苏州",0,1,123456));
        employees.put(2,new Employee(2,"湖北XXX公司",15254,133,"湖北武汉",0,1,111111));
        employees.put(3,new Employee(3,"上海XXX公司",15404,125,"上海闵行",1,0,654321));
    }

    //主键自增
    private static Integer initId = 4;

    //增加一个员工
    public void setEmployees(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initId++);
        }
       /* employee.setDepartment(DepartmentDao.getDepartmentById(employee.getDepartment().getId()));*/
        employees.put(employee.getId(), employee);


    }

    //获取所有员工信息
    public Collection<Employee> getEmployees() {
        return employees.values();
    }

    //通过id查询员工
    public Employee getEmployeeById(Integer id) {
        return employees.get(id);
    }

    //通过id删除员工
    public void deleteEmployeeById(Integer id) {
        employees.remove(id);
    }
}
