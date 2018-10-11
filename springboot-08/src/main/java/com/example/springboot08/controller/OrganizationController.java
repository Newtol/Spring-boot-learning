package com.example.springboot08.controller;
import com.example.springboot08.bean.Organization;
import com.example.springboot08.mapper.OrganizationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 公众号：Newtol
 * @Description:
 * @Date: Created in 17:06 2018/10/11
 */

@RestController
public class OrganizationController {


    @Autowired
    OrganizationMapper organizationMapper;


    @GetMapping("/get/{id}")
    public Organization getOrganizationById (@PathVariable("id") Integer id){
        return  organizationMapper.getOrganizationById(id);
    }

    @GetMapping("/del/{id}")
    int delOrganizationById (@PathVariable("id") Integer id){
        return organizationMapper.delOrganizationById(id);
    }

    @GetMapping("/insert")
    Organization insertOrganization(Organization organization){
         organizationMapper.insertOrganization(organization);
         return organization;
    }
}
