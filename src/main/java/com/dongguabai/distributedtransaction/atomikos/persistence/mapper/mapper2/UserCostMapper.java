package com.dongguabai.distributedtransaction.atomikos.persistence.mapper.mapper2;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * @author Dongguabai
 * @Description
 * @Date 创建于 2020-12-19 15:45
 */
public interface UserCostMapper {

    @Insert("INSERT into user_cost(cost) VALUES (#{cost})")
    int insert(@Param("cost")Object cost);
}
