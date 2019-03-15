package com.gaeainfo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
//http://localhost:9993/actuator/refresh POST请求手动刷新参数
public class ServiceConfig {
    @Value("${example.property}")
    private String exampleProperty;

    public String getExampleProperty(){
        return exampleProperty;
    }


}




