package com.gaeainfo.Conroller;

import com.gaeainfo.config.ServiceConfig;
import com.gaeainfo.services.HelloService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequestMapping("/user")
@Controller
public class UserController {

    //自动获取RestTemplate
    @Autowired
    private HelloService helloService;

    @Autowired
    private ServiceConfig serviceConfig;

    @RequestMapping("/test")
    @ResponseBody
    public String saytest() {
        String a = helloService.sayHello("test");
        System.out.println(serviceConfig.getExampleProperty());
        return a;

    }
}