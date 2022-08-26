package vip.epss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;    //Spring web 框架实现了 DispatcherServlet  进行分发 http请求
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import vip.epss.domain.Employee;
import vip.epss.service.EmployeeService;
import vip.epss.utils.MessageAndData;

import javax.servlet.http.HttpSession;
import java.util.List;

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

    //用于验证员工登录
    @RequestMapping("/login")
    public ModelAndView login(Employee employee, HttpSession httpSession){
        //ModelAndView  对象是spring封装model和view的通用容器
        ModelAndView modelAndView = new ModelAndView();

        //调用service进行登录验证
        boolean status  = employeeService.loginCheck(employee);
        if(status){
            //登录验证成功
            //http是一个无状态协议，为了保持通信双方的身份识别，一般采用  session（cookie）
            httpSession.setAttribute("EMP_SESSION",employee);
            modelAndView.setViewName("redirect:../employee.html");//
        }else{
            //回到登录页面
            modelAndView.setViewName("redirect:../index.html");//设置视图页   , 默认springmvc使用了视图解析器，会自动填充前缀和后缀
        }

        return modelAndView;
    }

    @RequestMapping("/list")
    @ResponseBody           //返回给客户端的是json数据
    public MessageAndData list(){
        List<Employee> employees = employeeService.selectAll();
        //发送的ajax请求，无需切换页面，返回数据即可
        MessageAndData emplist = MessageAndData.success().add("emplist", employees);
        return emplist;
    }

    @RequestMapping("/delete")
    @ResponseBody           //返回给客户端的是json数据
    public MessageAndData delete(@RequestParam Integer eid){
        Integer i = employeeService.deleteOne(eid);
        //发送的ajax请求，无需切换页面，返回数据即可
        MessageAndData msg = MessageAndData.success().add("i", i);
        return msg;
    }
}
