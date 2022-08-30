package vip.epss.service;

import vip.epss.domain.Department;

import java.util.List;

/**
 * 规范和Employee相关的业务接口定义
 * 出于面向对象的编程思路：  尽量基于接口编程
 */
public interface DepartmentService {

    public List<Department> selectAll();


}
