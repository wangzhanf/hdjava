package vip.epss.service;

import vip.epss.domain.Employee;
import vip.epss.domain.EmployeeExample;

import java.util.List;

/**
 * 规范和Employee相关的业务接口定义
 * 出于面向对象的编程思路：  尽量基于接口编程
 * */
public interface EmployeeService {
    //该业务的目的是添加一个新员工
    public boolean regNewEmployee(Employee employee);
    //用于登录验证
    public boolean loginCheck(Employee employee);
    //获取所有用户数据
    public List<Employee> selectAll();
    //删除一个员工数据
    public Integer deleteOne(Integer eid);
    //批量删除
    int deleteByExample(EmployeeExample example);

}
