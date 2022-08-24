package vip.epss.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Project implements Serializable {
    private Integer pid;

    private String pname;

    private Date puptime;

    //多对多 的  持有对象的表现方式
    private List<Employee> employees;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Date getPuptime() {
        return puptime;
    }

    public void setPuptime(Date puptime) {
        this.puptime = puptime;
    }

    public Project(String pname) {
        this.pname = pname;
    }

    public Project() {
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Project{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", puptime=" + puptime +
                ", employees=" + employees +
                '}';
    }
}