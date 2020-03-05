package com.hayes.code.clouddemoboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudDemoBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudDemoBootApplication.class, args);
    }

}
