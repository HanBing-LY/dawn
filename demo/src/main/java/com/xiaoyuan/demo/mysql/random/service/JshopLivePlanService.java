package com.xiaoyuan.demo.mysql.random.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoyuan.demo.mysql.random.mapper.JshopLivePlanMapper;
import com.xiaoyuan.demo.mysql.random.po.JshopLivePlanDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author : liyuan  
 * @description :
 * @date : 2020-07-27 21:06  
 */
@Service
public class JshopLivePlanService extends ServiceImpl<JshopLivePlanMapper, JshopLivePlanDO> {

    @Resource
    private JshopLivePlanMapper jshopLivePlanMapper;

    public void mutinse(){
        JshopLivePlanDO jshopLivePlanDO = new JshopLivePlanDO();
        jshopLivePlanDO.setLiveCode(UUID.randomUUID().toString().substring(0,10));

    }
}
