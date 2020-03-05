package com.hayes.code.clouddemoboot.controller;

import com.hayes.code.clouddemoboot.service.DidiFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DidiController {

    @Autowired
    private DidiFeignService didiFeignService;

    @RequestMapping("/info")
    public String syaHello(HttpServletRequest request) {
        String message = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getServletPath();
        return "info : " + message;
    }


    @RequestMapping("/from1")
    public String didi_from1() {
        return didiFeignService.from1();
    }

    @RequestMapping("/from2")
    public String didi_from2() {
        return didiFeignService.from1();
    }


}
