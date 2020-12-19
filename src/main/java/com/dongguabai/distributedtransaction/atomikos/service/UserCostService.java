package com.dongguabai.distributedtransaction.atomikos.service;

import com.dongguabai.distributedtransaction.atomikos.persistence.mapper.mapper2.UserCostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Dongguabai
 * @Description
 * @Date 创建于 2020-12-19 15:41
 */
@Service
public class UserCostService {

    @Autowired
    private UserCostMapper userCostMapper;

    public int insert(Object cost) {
        return userCostMapper.insert(cost);
    }
}
