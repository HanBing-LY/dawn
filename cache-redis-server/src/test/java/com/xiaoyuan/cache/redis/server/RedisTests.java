package com.xiaoyuan.cache.redis.server;

import org.junit.jupiter.api.Test;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author : liyuan  
 * @description :
 * @date : 2020/8/10 10:23  
 */
@SpringBootTest
public class RedisTests {


    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedissonClient redissonClient;

    @Test
    public void init() {
        String key = "ext:sequence:increment";
        Set<Object> keys = stringRedisTemplate.opsForHash().keys(key);
        keys = keys.stream().filter(i -> !(i.toString().contains("BILL") || i.toString().contains("ORDER")|| i.toString().contains("VIP")|| i.toString().contains("LIVE")|| i.toString().contains("TOCHASH"))).collect(Collectors.toSet());
        keys.forEach(i -> {
            if (i.toString().contains("DATA")) {
                System.out.println(i.toString());
            }
        });

    }
}
