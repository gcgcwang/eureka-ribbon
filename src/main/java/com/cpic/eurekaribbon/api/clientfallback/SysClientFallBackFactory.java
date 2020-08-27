package com.cpic.eurekaribbon.api.clientfallback;

import com.cpic.eurekaribbon.api.client.SysClient;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Desc:
 * @Author: wangguochao-001
 * @Date：2020/6/17
 */
@Component
public class SysClientFallBackFactory implements FallbackFactory<SysClient> {

    private Logger logger = LoggerFactory.getLogger(SysClientFallBackFactory.class);
    @Override
    public SysClient create(Throwable throwable) {
        logger.error("SysClient回退，原因是：   "+throwable.getCause());
        return new SysClient() {
            @Override
            public String helloService(String service_name) {
                    return "request fail|||";
            }
        };
    }
}
