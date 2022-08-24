package vip.epss.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Department implements Serializable {
    private Integer did;

    private String dname;

    public Department() {
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Department{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", duptime=" + duptime +
                ", employees=" + employees +
                '}';
    }

    public Department(String dname) {
        this.dname = dname;
    }

    private Date duptime;

    //1对多 的  持有对象的表现方式
    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Date getDuptime() {
        return duptime;
    }

    public void setDuptime(Date duptime) {
        this.duptime = duptime;
    }
}