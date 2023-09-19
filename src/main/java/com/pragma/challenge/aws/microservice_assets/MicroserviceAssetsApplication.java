package com.pragma.challenge.aws.microservice_assets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroserviceAssetsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceAssetsApplication.class, args);
    }

}
