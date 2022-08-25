package vip.epss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import vip.epss.dao.EmployeeMapper;
import vip.epss.domain.Employee;
import vip.epss.domain.EmployeeExample;
import vip.epss.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;//自动注入，  看到存在成员时，如果有Autowired注解修饰，则从IOC容器取出对象使用


    //该业务的目的是添加一个新员工
    @Override
    public boolean regNewEmployee(Employee employee) {
        //1 先查询是否存在该员工
        //mybatis生成的条件实体类的用法
        EmployeeExample employeeExample = new EmployeeExample();
        EmployeeExample.Criteria criteria = employeeExample.createCriteria();
        criteria.andEnameEqualTo(employee.getEname());

        List<Employee> employees = employeeMapper.selectByExample(employeeExample);
        if (employees.size() > 0){
            System.out.println("存在同名用户");
            return false;
        }else {
            //2 将信息插入到数据库中
            int i = employeeMapper.insertSelective(employee);
            System.out.println("成功添加了" + i + "个  Employee");
            return true;
        }
    }
}
