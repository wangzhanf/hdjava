package vip.epss.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vip.epss.domain.Employee;
import vip.epss.domain.EmployeeExample;
import vip.epss.service.EmployeeService;
import vip.epss.utils.MessageAndData;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
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
    public MessageAndData list(
            @RequestParam(value = "page",defaultValue = "1")Integer page,
            @RequestParam(value = "pageSize",defaultValue = "3")Integer pageSize
    ){
        List<Employee> employees = employeeService.selectAll();
        //初始化,约束
        PageHelper.startPage(page, pageSize);
        //使用pageHelper的方式封装数据
        PageInfo pageInfo = new PageInfo(employees, 4);
        return MessageAndData.success().add("pageInfo",pageInfo);
    }

    @RequestMapping("/delete")
    @ResponseBody           //返回给客户端的是json数据
    public MessageAndData delete(@RequestParam Integer eid){
        Integer i = employeeService.deleteOne(eid);
        //发送的ajax请求，无需切换页面，返回数据即可
        MessageAndData ret = MessageAndData.success().add("num", i);
        return ret;
    }


    @ResponseBody
    @RequestMapping(value = "/opt/{ids}",method = RequestMethod.DELETE)
    public MessageAndData deletes(@PathVariable("ids")String ids){
        //获取传递过来的eid列表,分解为一个集合对象
        List<Integer> iIds = new ArrayList<Integer>();
        String[] sIds = ids.split("-");
        Integer i = null;
        for (String sEid : sIds) {
            iIds.add(Integer.parseInt(sEid));
        }
        if(iIds.size() > 1) {//删除多条记录
            //创建一个EmployExample对象
            EmployeeExample employeeExample = new EmployeeExample();
            employeeExample.createCriteria().andEidIn(iIds);
            //执行批量删除
            i = employeeService.deleteByExample(employeeExample);
        }else{//删除一条记录
            i = employeeService.deleteOne(iIds.get(0));
        }
        return MessageAndData.success().add("num", i);
    }


//    REST风格本质上就是把操作语义化,把MVC中通过虚拟路径映射到不同的方法这种形式变更为同一路径,采用的HTTP方法不同进行区分
//    对于数据的操作 CRUD
//    /employ/add(post)       增加C             /employ/opt      [POST]
//    /employ/list?eid=3      查询R             /employ/opt/3    [GET]
//    /employ/update(post)    修改U             /employ/opt      [PUT]
//    /employ/delete?eid=3    删除D             /employ/opt/3    [DELETE]

//    具体实现REST风格
//    1 默认web应用只支持GET和POST,需要在web.xml中配置转换器
//    2 前端页面通过添加隐藏表单域的方式指明使用的方法
//    3 后端Controller处理时映射具体的方法
}
