package vip.epss.domain;

import java.io.Serializable;
import java.util.Date;

public class Info implements Serializable {
    private Integer iid;

    private String iphone;

    private Integer ieid;

    private Date iuptime;

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public Integer getIeid() {
        return ieid;
    }

    public void setIeid(Integer ieid) {
        this.ieid = ieid;
    }

    public Date getIuptime() {
        return iuptime;
    }

    public void setIuptime(Date iuptime) {
        this.iuptime = iuptime;
    }

    public Info(String iphone, Integer ieid) {
        this.iphone = iphone;
        this.ieid = ieid;
    }

    public Info() {
    }

    @Override
    public String toString() {
        return "Info{" +
                "iid=" + iid +
                ", iphone='" + iphone + '\'' +
                ", ieid=" + ieid +
                ", iuptime=" + iuptime +
                '}';
    }
}