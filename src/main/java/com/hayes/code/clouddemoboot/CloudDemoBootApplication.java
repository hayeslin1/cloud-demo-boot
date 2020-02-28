package com.hayes.code.clouddemoboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudDemoBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudDemoBootApplication.class, args);
    }

}
