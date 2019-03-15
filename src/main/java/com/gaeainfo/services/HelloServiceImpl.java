package com.gaeainfo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String sayHello(String name) {
        //调用生产者的服务返回信息
//        ResponseEntity<String> responseEntity = restTemplate.exchange("http://ORGANIZATIONSERVICE/1", HttpMethod.GET,null,String.class);
//        System.out.println(responseEntity);
//        return restTemplate.getForObject("http://ORGANIZATIONSERVICE/1", String.class);
        ResponseEntity<String> responseEntity = restTemplate.exchange("http://ORGANIZATIONSERVICE/v1/organizations/1/licenses/{name}", HttpMethod.GET, null, String.class, name);
        return responseEntity.getBody();
    }

}