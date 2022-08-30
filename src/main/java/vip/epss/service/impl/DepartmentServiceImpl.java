package vip.epss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.epss.dao.DepartmentMapper;
import vip.epss.domain.Department;
import vip.epss.service.DepartmentService;

import java.util.List;

@Service(value = "departmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public List<Department> selectAll() {
        return departmentMapper.selectByExample(null);
    }
}
