package com.xiaoyuan.demo.mysql.random.controller;

import com.xiaoyuan.demo.mysql.random.po.JshopLivePlanDO;
import com.xiaoyuan.demo.mysql.random.service.JshopLivePlanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : liyuan  
 * @description :
 * @date : 2020-07-27 21:08  
 */
@RestController
public class JshopLivePersonController {

    @Resource
    private JshopLivePlanService jshopLivePlanService;

    @GetMapping("/queryAll")
    public String queryAll(){
        List<JshopLivePlanDO> list = jshopLivePlanService.list();
        return "success";
    }
}
