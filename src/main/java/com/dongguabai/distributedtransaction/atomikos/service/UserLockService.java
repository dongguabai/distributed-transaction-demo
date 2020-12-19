package com.dongguabai.distributedtransaction.atomikos.service;

import com.dongguabai.distributedtransaction.atomikos.persistence.mapper.mapper.UserLockMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Dongguabai
 * @Description
 * @Date 创建于 2020-12-19 15:41
 */
@Service
public class UserLockService {

    @Autowired
    private UserLockMapper userLockMapper;

    public int insert(Object name,Object age){
        return userLockMapper.insert(name, age);
    }
}
