package cn.newtol.springboot06.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author: REN
 * @Description:
 * @Date: Created in 20:57 2018/9/19
 */
@RestController
public class HelloController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/test")
    public Map<String,Object> hello(){
        List<Map<String,Object>> list = jdbcTemplate.queryForList("SELECT * FROM organization");
        return list.get(0);

    }

}
