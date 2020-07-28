package com.xiaoyuan.demo.mysql.random.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoyuan.demo.mysql.random.mapper.JshopLivePersonMapper;
import com.xiaoyuan.demo.mysql.random.po.JshopLivePersonDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class JshopLivePersonService extends ServiceImpl<JshopLivePersonMapper, JshopLivePersonDO> {

    @Resource
    private JshopLivePersonMapper jshopLivePersonMapper;
}