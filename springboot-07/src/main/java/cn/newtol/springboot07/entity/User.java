package cn.newtol.springboot07.entity;
import javax.persistence.*;

/**
 * @Author: 公众号：Newtol
 * @Description:  JPA使用示例:使用JPA注解配置映射关系
 * @Date: Created in 18:45 2018/9/24
 */

@Entity   //表示一个实体类，和数据表进行映射
@Table(name = "t_user")   //所映射的表的名字，可省略，默认为实体类名
public class User {


    @Id //设置为主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //定义为自增主键
    private Integer id;

    @Column(name = "t_name",nullable = false)  //设置该字段在数据表中的列名,并设置该字段设置为不可为空
    private String name;

    @Column     //默认则字段名就为属性名
    private Integer phone;

//    @Transient   //增加该注解，则在数据表中不会进行映射
    private String address;


    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}

