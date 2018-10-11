package com.example.springboot08.mapper;

import com.example.springboot08.bean.Organization;
import org.apache.ibatis.annotations.*;

/**
 * @Author: 公众号：Newtol
 * @Description:
 * @Date: Created in 16:55 2018/10/11
 */


//public interface OrganizationMapper {
//
//    @Select("SELECT * FROM organization where id = #{id}")
//    Organization getOrganizationById (Integer id);
//
//    @Delete("DELETE FROM organization where id = #{id}")
//    int delOrganizationById (Integer id);
//
//    @Options(useGeneratedKeys = true,keyProperty = "id")
//    @Insert("INSERT INTO organization(active,company_name) VALUES (#{active},#{companyName})")
//    int insertOrganization(Organization organization);
//
//}
public interface OrganizationMapper{

    Organization getOrganizationById (Integer id);

    int insertOrganization(Organization organization);

    int delOrganizationById (Integer id);
}