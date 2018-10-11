package com.example.springboot08.bean;

/**
 * @Author: 公众号：Newtol
 * @Description:
 * @Date: Created in 12:11 2018/10/11
 */
public class Organization {
    private Integer id;
    private Integer active;
    private String companyName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
