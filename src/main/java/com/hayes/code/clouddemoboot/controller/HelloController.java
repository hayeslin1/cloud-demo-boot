package com.hayes.code.clouddemoboot.controller;

import com.hayes.code.clouddemoboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(String.valueOf(getClass()));

    @Autowired
    private DiscoveryClient client ;

    @RequestMapping("/hello")
    public String index(){

        ServiceInstance instance = client.getLocalServiceInstance();

        return "/hello , " +
                "host:"+instance.getHost()+
                ", port: "+instance.getPort()+
                ", service_id: "+instance.getServiceId() ;

    }
    @RequestMapping("/hello1")
    public String index1(HttpServletRequest request , @RequestParam("name") String name){
        String name1 = request.getParameter("name");
        logger.info(name1);
        return "hello "+name ;

    }
    @RequestMapping("/hello2")
    public User index2(HttpServletRequest request , @RequestHeader("name") String name, @RequestHeader("age") int age){
//        ServiceInstance instance = client.getLocalServiceInstance();
        String name1 = request.getHeader("name");
        String age1 = request.getHeader("age");
        logger.info(name1 +"  : "+age1);
        return new User(name, age) ;

    }


    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public User index3(@RequestBody User user){
        logger.info(user.toString());
        return user ;

    }

}
