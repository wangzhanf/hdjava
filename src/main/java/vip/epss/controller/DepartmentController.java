package vip.epss.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vip.epss.domain.Department;
import vip.epss.domain.Employee;
import vip.epss.domain.EmployeeExample;
import vip.epss.service.DepartmentService;
import vip.epss.service.EmployeeService;
import vip.epss.utils.MessageAndData;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/list")
    @ResponseBody           //返回给客户端的是json数据
    public MessageAndData list(
            @RequestParam(value = "page",defaultValue = "1")Integer page,
            @RequestParam(value = "pageSize",defaultValue = "3")Integer pageSize
    ){
        List<Department> departments = departmentService.selectAll();
        //初始化,约束
        PageHelper.startPage(page, pageSize);
        //使用pageHelper的方式封装数据
        PageInfo pageInfo = new PageInfo(departments, 4);
        return MessageAndData.success().add("pageInfo",pageInfo);
    }

}
