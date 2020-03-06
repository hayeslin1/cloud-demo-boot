package com.hayes.code.clouddemoboot.service;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@EnableFeignClients
public class DidiFeignServiceFallback implements DidiFeignService{

    @RequestMapping("/from1")
    public String from1() {
        return "请求失败,进入服务降级";
    }

    @RequestMapping("/from2")
    public String from2() {
        return "请求失败,进入服务降级";
    }

}
