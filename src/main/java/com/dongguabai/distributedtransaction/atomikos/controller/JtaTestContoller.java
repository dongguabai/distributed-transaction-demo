package com.dongguabai.distributedtransaction.atomikos.controller;

import com.dongguabai.distributedtransaction.atomikos.service.JtaTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;

/**
 * @author Dongguabai
 * @Description
 * @Date 创建于 2020-12-19 15:39
 */
@RestController
@RequestMapping("/jtaTest")
public class JtaTestContoller {

    @Autowired
    private JtaTestService jtaTestService;

    @RequestMapping("/test")
    public Object test() {
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        try {
            jtaTestService.test01();
            return "OK";
        } catch (Exception e) {
            resultMap.put("出现异常了", e);
            e.printStackTrace();
            return resultMap;
        }
    }
}
