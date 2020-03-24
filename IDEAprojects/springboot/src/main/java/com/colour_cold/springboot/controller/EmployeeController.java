package com.colour_cold.springboot.controller;

import com.colour_cold.springboot.Dao.DepartmentDao;
import com.colour_cold.springboot.Dao.EmployeeDao;
import com.colour_cold.springboot.pojo.Department;
import com.colour_cold.springboot.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;

    @RequestMapping("/emps")
    public String list(Model model) {
        Collection<Employee> employees = employeeDao.getEmployees();
        model.addAttribute("emps", employees);
        return "emp/list";
    }

    public class DepartmentController {

        @GetMapping("/emp")
        public String toAddPage(Model model) {
            //查出所有部门的信息
            Collection<Department> departments = departmentDao.getDepartments();
            model.addAttribute("departments", departments);
            return "emp/add";
        }
    }
}
