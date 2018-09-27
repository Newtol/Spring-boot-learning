package cn.newtol.springboot07.repository;

import cn.newtol.springboot07.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Author: 公众号：Newtol
 * @Description:
 * @Date: Created in 19:35 2018/9/24
 */

//定义为接口
public interface UserRepository extends JpaRepository<User,Integer>{
    //关键字查询
    List<User> findByAddressEqualsAndPhoneNot (String address, Integer phone);

    //自定义SQL查询
    @Query(value = "select * from t_user WHERE phone = ? " ,nativeQuery = true)
    List<User> getAllUser (Integer phone);

    //自定义SQL删除
    @Query(value = "delete from t_user WHERE phone = ? ",nativeQuery = true)
    @Modifying
    @Transactional
    void deleteUser(Integer phone);

    //JPQL查询
    @Query("select u from User u where u.name = ?1")
    User getUserByName(String name);

    //限制查询
    List<User> findFirst2ByAddressOrderByIdDesc (String address);






}
