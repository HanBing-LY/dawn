package com.xiaoyuan.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {

        System.out.println(UUID.randomUUID().toString().substring(0,10));
    }

}
