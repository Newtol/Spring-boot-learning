package cn.newtol.springboot05.entity;

/**
 * @Author: REN
 * @Description:
 * @Date: Created in 20:10 2018/9/17
 */

public class Person {
    private String name;
    private Integer phone;

    public Person(String name, Integer phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
