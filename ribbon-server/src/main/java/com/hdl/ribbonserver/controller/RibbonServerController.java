package com.hdl.ribbonserver.controller;

import com.hdl.ribbonserver.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonServerController {

    @Autowired
    RibbonService ribbonService;

    @RequestMapping("/action")
    public String action(){
        return ribbonService.action();
    }

    @RequestMapping("/name")
    public String name(){
        return ribbonService.name();
    }

}
