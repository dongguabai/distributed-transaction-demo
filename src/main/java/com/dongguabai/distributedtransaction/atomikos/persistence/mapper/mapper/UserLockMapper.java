package com.dongguabai.distributedtransaction.atomikos.persistence.mapper.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * @author Dongguabai
 * @Description
 * @Date 创建于 2020-12-19 15:45
 */
public interface UserLockMapper {

    @Insert("INSERT into user_lock(name,age) VALUES (#{name}, #{age})")
    int insert(@Param("name")Object name,@Param("age")Object age);
}
