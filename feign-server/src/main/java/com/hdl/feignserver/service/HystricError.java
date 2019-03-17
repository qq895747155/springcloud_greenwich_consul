package com.hdl.feignserver.service;

import org.springframework.stereotype.Component;

@Component
public class HystricError implements FeignService {
    @Override
    public String action() {
        return "Feign:服务不可用！";
    }

    @Override
    public String name() {
        return "Feign:服务不可用！";
    }
}
