package com.hdl.feignserver.controller;

import com.hdl.feignserver.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignServerController {

    @Autowired
    FeignService feignService;

    @RequestMapping("/action")
    public String action(){
        return feignService.action();
    }

    @RequestMapping("/name")
    public String name(){
        return feignService.name();
    }
}
