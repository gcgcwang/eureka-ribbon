package com.cpic.eurekaribbon.api.client;

import com.cpic.eurekaribbon.api.clientfallback.SysClientFallBackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Desc:
 * @Author: wangguochao-001
 * @Date：2020/6/17
 */
@FeignClient(value="eureka-client",fallbackFactory = SysClientFallBackFactory.class)
public interface SysClient {

    @GetMapping("/hello")
    String helloService(@RequestParam("name")String service_name);
}
