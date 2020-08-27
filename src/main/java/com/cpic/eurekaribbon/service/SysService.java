package com.cpic.eurekaribbon.service;

import com.cpic.eurekaribbon.api.client.SysClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Desc:
 * @Author: wangguochao-001
 * @Date：2020/6/15
 */
@Service
public class SysService {

    @Autowired
    RestTemplate restTemplate;
//    @Autowired
//    SysClient sysClient;

    public String hiService(String service_name){
        return restTemplate.getForObject("http://eureka-client/demo?name="+service_name,String.class);
    //    return sysClient.helloService(service_name);
    }

}
