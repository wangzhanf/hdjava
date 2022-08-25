package vip.epss.service;

import vip.epss.domain.Employee;

/**
 * 规范和Employee相关的业务接口定义
 * */
public interface EmployeeService {
    //该业务的目的是添加一个新员工
    public boolean regNewEmployee(Employee employee);
}
