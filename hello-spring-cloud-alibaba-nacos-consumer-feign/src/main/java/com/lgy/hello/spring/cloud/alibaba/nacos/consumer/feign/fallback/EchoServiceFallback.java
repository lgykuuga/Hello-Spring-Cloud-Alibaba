package com.lgy.hello.spring.cloud.alibaba.nacos.consumer.feign.fallback;

import com.lgy.hello.spring.cloud.alibaba.nacos.consumer.feign.service.EchoService;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author LGy
 * @Date 2019/10/30 11:49
 **/
@Component
public class EchoServiceFallback implements EchoService {

    @Override
    public String echo(String message) {
        return "echo fallback";
    }
}
