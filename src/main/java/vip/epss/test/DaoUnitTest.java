package vip.epss.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.core.io.Resource;
import vip.epss.dao.DepartmentMapper;
import vip.epss.dao.EmployeeMapper;
import vip.epss.dao.InfoMapper;
import vip.epss.dao.ProjectMapper;
import vip.epss.domain.Employee;
import vip.epss.domain.Project;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/*
* Dao层的单元测试类
* */
public class DaoUnitTest {
    private EmployeeMapper employeeMapper;
    private DepartmentMapper departmentMapper;
    private InfoMapper infoMapper;
    private ProjectMapper projectMapper;

    public DaoUnitTest() throws IOException {
        //读取单元测试使用的mybatis配置文件
        String resource = "mybatisJunitTest.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);//当前session是自动提交的commit
        //通过动态代理生成实现类
        employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
        infoMapper = sqlSession.getMapper(InfoMapper.class);
        projectMapper = sqlSession.getMapper(ProjectMapper.class);
    }

    @Test
    public void testSelectOneEmployee() throws IOException {
        //读取单元测试使用的mybatis配置文件
//        String resource = "mybatisJunitTest.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);//当前session是自动提交的commit
//        //通过动态代理生成实现类
//        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = employeeMapper.selectByPrimaryKey(4);
        System.out.println(employee);
    }

    @Test
    public void testSelectAllEmployee() throws IOException {
        //读取单元测试使用的mybatis配置文件
//        String resource = "mybatisJunitTest.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);//当前session是自动提交的commit
//        //通过动态代理生成实现类
//        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employees = employeeMapper.selectByExample(null);
        System.out.println(employees);
    }

//    测试持有1对1 对象的自动封装
    @Test
    public void testEmployeeSelectByPrimaryKeyWithObject(){
        Employee employee = employeeMapper.selectByPrimaryKeyWithObject(1);
        System.out.println(employee);
    }

    @Test
    public void testProjectSelectByPrimaryKeyWithObject(){
        Project project = projectMapper.selectByPrimaryKeyWithObject(2);
        System.out.println(project);
    }
}
