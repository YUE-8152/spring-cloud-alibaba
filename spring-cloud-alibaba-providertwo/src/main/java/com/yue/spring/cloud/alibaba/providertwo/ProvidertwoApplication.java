package com.yue.spring.cloud.alibaba.providertwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProvidertwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvidertwoApplication.class, args);
    }

}
