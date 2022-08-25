package vip.epss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import vip.epss.domain.Employee;
import vip.epss.service.EmployeeService;

//也应该纳入到Spring容器中管理，但是Controller和用户直接交互，建议分离spring，此例采用spring-mvc
//如何称为一个Controller呢
@Controller
//Controller和用户交互， 用户一般HTTP协议访问Controller，给不同的Controller和不同的方法映射不同的url地址，进行匹配
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/register")   // 拼接结果   应用发布地址+类映射地址+方法映射地址  http://localhost:8888/hdjava_war/employee/register
    public void regEmployee(Employee employee){
        boolean b = employeeService.regNewEmployee(employee);
        System.out.println(b);
    }
}
