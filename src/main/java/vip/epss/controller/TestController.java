package vip.epss.controller;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import vip.epss.domain.Department;
import vip.epss.domain.Employee;
import vip.epss.utils.MessageAndData;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping("/reOut")
    public String redirectOutTest(){
        return "redirect:http://www.baidu.com";//重定向是两次请求，是客户端发生，发生在外部，所以可以重定向到任意
    }

    @RequestMapping("/reIn")
    public String redirectInTest(){  //http://localhost:8888/hdjava_war/test/reIn
        return "redirect:../employee.html";//重定向是两次请求，是客户端发生，发生在外部，所以可以重定向到任意
    }

    @RequestMapping("/reErr")
    public String redirectErrTest(){  //http://localhost:8888/hdjava_war/test/reErr
        return "redirect:../WEB-INF/pages/haha.jsp";//重定向是两次请求，是客户端发生，发生在外部，所以可以重定向到任意[安全目录不可以]
    }

    @RequestMapping("/fwView")
    public String forwardViewTest(){  //http://localhost:8888/hdjava_war/test/fwView
        return "haha";//转发到视图页，转发是内部的，所以可以进入安全目录
    }

    @RequestMapping("/fwMV")
    public ModelAndView forwardMVTest(){  //http://localhost:8888/hdjava_war/test/fwMV
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("mydata","wangzhanf");
        modelAndView.setViewName("haha");//视图解析器会参与
        return modelAndView;//转发到视图页，转发是内部的，所以可以进入安全目录
        //数据部分会被封装到  ModelAndView对象中，  存在   服务器端  ，  haha.jsp 本质上是一个java servlet  ， 通过jsp访问内存中模型   ModelAndView
        //局限性，用户必须使用jsp作为视图表现，  HTML和java代码耦合过高
    }

    @RequestMapping("/onlyData")
    @ResponseBody   //意味着只需要controller返回数据部分， 没有视图转发或重定向
    public MessageAndData jsonAjaxTest(){  //http://localhost:8888/hdjava_war/test/onlyData
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("zhangsan","123"));
        employees.add(new Employee("lisi","456"));

        List<Department> departments = new ArrayList<>();
        departments.add(new Department("市场部"));
        departments.add(new Department("财务部"));
        departments.add(new Department("开发部"));


        MessageAndData messageAndData =  MessageAndData.success();
        messageAndData.setMessage("获取部门数据和员工数据成功");
        messageAndData.add("empList",employees).add("depList",departments);

        return messageAndData;
    }

    @ResponseBody
    @RequestMapping("/updateData")
    public MessageAndData updateTest(){  //http://localhost:8888/hdjava_war/test/fwView
        return MessageAndData.success();
    }
}
