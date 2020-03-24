package com.colour_cold.springboot.Dao;

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
        employees.put(01, new Employee(01, "张三", "111111@qq.com", 1, new Department(101, "教学部")));
        employees.put(02, new Employee(02, "李四", "222222@qq.com", 0, new Department(102, "市场部")));
        employees.put(03, new Employee(03, "王五", "333333@qq.com", 1, new Department(103, "教研部")));
        employees.put(04, new Employee(04, "赵六", "444444@qq.com", 1, new Department(104, "运营部")));
        employees.put(05, new Employee(05, "田七", "555555@qq.com", 0, new Department(105, "后勤部")));
    }

    //主键自增
    private static Integer initId = 05;

    //增加一个员工
    public void setEmployees(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initId++);
        }
        employee.setDepartment(DepartmentDao.getDepartmentById(employee.getDepartment().getId()));
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
