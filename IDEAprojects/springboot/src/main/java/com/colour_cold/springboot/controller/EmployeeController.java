package com.colour_cold.springboot.controller;

import com.colour_cold.springboot.Dao.DepartmentDao;
import com.colour_cold.springboot.Dao.EmployeeDao;
import com.colour_cold.springboot.pojo.Department;
import com.colour_cold.springboot.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
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

    //员工添加
    //来到员工添加页面
    @GetMapping("/emp")
    public  String toAddPage() {
        //来到添加页面
        return "emp/add";
    }

    //springmvc自动将请求参数和入参对象的属性进行一一绑定，要求了请求参数的名字和javaBean入参对象里面的属性名是一样的
    @PostMapping("/emp")
    public String addEmp(Employee employee) {
        //来到员工列表页面
        System.out.println("保存的员工信息" + employee);
        //保存员工
        employeeDao.setEmployees(employee);
        //redirect：表示重定向到一个地址
        //forward：表示转发到一个地址
        return "redirect:/emps";
    }

    //来到修改页面，查出当前员工后回显
    @RequestMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") int id,Model model) {
        Employee employeeById = employeeDao.getEmployeeById(id);
        model.addAttribute("emp",employeeById);
        //回到修改页面add(修改添加二合一)
        return "emp/add";
    }

    //员工修改
    @PutMapping("/emp")
    public String updateEmployee(Employee employee) {
        employeeDao.setEmployees(employee);
        return "redirect:/emps";
    }

    //员工删除
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") int id) {
        employeeDao.deleteEmployeeById(id);
        return "redirect:/emps";
    }
}
