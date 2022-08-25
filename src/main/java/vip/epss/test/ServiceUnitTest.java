package vip.epss.test;

import org.apache.log4j.spi.LoggerFactory;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.epss.domain.Employee;
import vip.epss.service.EmployeeService;

/**
 * 使用spring整合junit进行单元测试
 *
 * */
@RunWith(SpringJUnit4ClassRunner.class)//加载spring   容器
@ContextConfiguration("classpath:applicationContext.xml")//加载配置文件
public class ServiceUnitTest {

    //代码调试的时候其中有一个办法是日志输出，1  System.out.println   ，   2 日志logger
    //

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testServiceRegNewEmployee(){
        Employee zs = new Employee("zhangxiaosan", "999");//模拟的一个用户
        boolean b = employeeService.regNewEmployee(zs);
        System.out.println(b);
    }

}
