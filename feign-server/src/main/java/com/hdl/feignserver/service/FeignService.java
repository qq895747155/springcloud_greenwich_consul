package com.hdl.feignserver.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "CLIENT",fallback = HystricError.class)
public interface FeignService {

    @RequestMapping("/action")
    String action();

    @RequestMapping("/name")
    String name();

}
