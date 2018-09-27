package cn.newtol.springboot07.controller;

import cn.newtol.springboot07.entity.User;
import cn.newtol.springboot07.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



/**
 * @Author: 公众号：Newtol
 * @Description:
 * @Date: Created in 19:37 2018/9/24
 */


@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    //根据Id查询用户
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        //默认方法实现
        User user = userRepository.getOne(id);

        User user1 = userRepository.findById(id).get();
        return user;
    }


    //自定义关键字查询
    @GetMapping("/test/{address}/{phone}")
    public List<User> getUserByAddressAndPhone (@PathVariable("address") String address, @PathVariable("phone") Integer phone){
        return userRepository.findByAddressEqualsAndPhoneNot(address,phone);
    }

    //插入用户
    @GetMapping("/user")
    public User addUser(User user){
        userRepository.save(user);
        return user;
    }

    //自定义SQL查询
    @GetMapping("/test/{phone}")
    public List<User> getAllUser(@PathVariable("phone") Integer phone){
        return userRepository.getAllUser(phone);
    }

    //自定义SQL删除
    @GetMapping("/del/{phone}")
    public void deleteUser(@PathVariable("phone") Integer phone){
       userRepository.deleteUser(phone);
    }

    //JPQL查询
    @GetMapping("/get/{name}")
    public User getUserByName(@PathVariable("name") String name){
        return userRepository.getUserByName(name);
    }

    //分页查询
    @GetMapping("/userList/{page}/{size}")
    public Page<User> getUserList(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        PageRequest pageRequest = PageRequest.of(page,size,sort);
        return  userRepository.findAll(pageRequest);
    }

    @GetMapping("/top2/{address}")
    public List<User> getTop2User(@PathVariable("address") String address){
        return userRepository.findFirst2ByAddressOrderByIdDesc(address);
    }

}
