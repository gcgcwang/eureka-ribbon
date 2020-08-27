package com.cpic.eurekaribbon.controller;

import com.cpic.eurekaribbon.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc:
 * @Author: wangguochao-001
 * @Date：2020/6/15
 */
@RestController
public class SysController {
    @Autowired
    SysService sysService;
    @ResponseBody
    @RequestMapping("/hi")
    public String greetService(@RequestParam("service_name")String service_name){
        return sysService.hiService(service_name);
    }
}
