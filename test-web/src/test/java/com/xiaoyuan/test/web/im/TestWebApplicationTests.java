package com.xiaoyuan.test.web.im;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

@SpringBootTest
class TestWebApplicationTests {

    @Test
    void contextLoads() {

        IMSendMes imSendMes = new IMSendMes();
        imSendMes.setGroupId("@TGS#aP6LHITGO");
        imSendMes.setRandom((long) ((Math.random() * 9 + 1) * 100000));

        ArrayList<HashMap> hashMapArrayList = new ArrayList<>();
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("MsgType", "TIMTextElem");
        HashMap<Object, Object> objectObjectHashMap1 = new HashMap<>();
        objectObjectHashMap1.put("Text", UUID.randomUUID().toString());
        objectObjectHashMap.put("MsgContent", objectObjectHashMap1);
        hashMapArrayList.add(objectObjectHashMap);

        imSendMes.setMsgBody(hashMapArrayList);

//""
        RestTemplate restTemplate = new RestTemplate();
//        String url = "https://console.tim.qq.com/v4/group_open_http_svc/send_group_msg?usersig=eJwtzFELgjAUBeD-sueQq-NSE3rR6iGUHorp62CbXMQ1thFB9N8T8-F853A*7NHes5cJrGJFBmy3ZtLGJbK0stIzOYopqPQM2yDqSXlPmlV5CcBFyQX8G-P2FMziiFgAbJpoXk0gIOwF315oXP7FqT2TlLWbYtP1t0Eecl7L1Et50cOo0LbUmFinq*2O7PsDTYw0rw__&identifier=administrator&sdkappid=1400394390&contenttype=json";
        String url = "https://console.tim.qq.com/v4/group_open_http_svc/send_group_msg?usersig=eJw1jssKwjAURP8lW6XcpA9MwUUrKBV3bVXcFZLKpeZhGmxB-He11uUc5gzzJNWhDORo0UmShgnAciIP6UhKWADkl3vRNdaiICmNAEIehXxuopDaY4uT0AiFGnvvGm-cX8Xrd6oY9rVBC7KlHbDVoMdNfhkXypxocVflLYvy3bHqt*d6PYse1ecTjXkMCaMJvN6VyTP2&sdkappid=1400394390&contenttype=json&identifier=administrator";
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add("Accept", "*/*");
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        HttpEntity<String> request = new HttpEntity<>(JSONObject.toJSONString(imSendMes), headers);

        ResponseEntity<String> stringResponseEntity = restTemplate.postForEntity(url, request, String.class);
        String body = stringResponseEntity.getBody();
        IMResponse imResponse = JSONObject.parseObject(body, IMResponse.class);
        boolean flag = imResponse != null && imResponse.getErrorCode().equals(0);
        System.out.println(flag);
    }
}
