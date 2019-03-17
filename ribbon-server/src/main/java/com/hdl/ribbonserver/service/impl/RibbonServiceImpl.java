package com.hdl.ribbonserver.service.impl;

import com.hdl.ribbonserver.service.RibbonService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonServiceImpl implements RibbonService {

    @Autowired
    RestTemplate restTemplate;


    //注解HystrixCommand对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法
    @HystrixCommand(fallbackMethod = "error")
    @Override
    public String action() {
        return restTemplate.getForObject("http://CLIENT/action",String.class);
    }

    @HystrixCommand(fallbackMethod = "error")
    @Override
    public String name() {
        return restTemplate.getForObject("http://CLIENT/name",String.class);
    }

    //熔断方法
    public String error(){
        return "服务不可用！";
    }
}
