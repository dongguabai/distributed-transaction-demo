package com.dongguabai.distributedtransaction.atomikos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedHashMap;

/**
 * @author Dongguabai
 * @Description
 * @Date 创建于 2020-12-19 15:40
 */
@Service
public class JtaTestService{

    @Autowired
    private UserCostService userCostService;

    @Autowired
    private UserLockService userLockService;

    @Transactional(transactionManager = "xatx", propagation = Propagation.REQUIRED, rollbackFor = { java.lang.RuntimeException.class })
    public Object test01() {
        int userCost = userCostService.insert("aa");
        int userLock = userLockService.insert("haha",12);
        return "OK";
    }
}
