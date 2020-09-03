package com.spring_cloud.new_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NewClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewClientApplication.class, args);
    }

}
