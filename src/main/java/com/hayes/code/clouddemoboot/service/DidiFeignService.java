package com.hayes.code.clouddemoboot.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "didispace" , fallback = DidiFeignServiceFallback.class )
public interface DidiFeignService {

    @RequestMapping("/from1")
    public String from1() ;

    @RequestMapping("/from2")
    public String from2() ;

}
