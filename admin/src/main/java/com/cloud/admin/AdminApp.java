package com.cloud.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Repository;

@MapperScan(annotationClass = Repository.class, basePackages = "com.cloud.admin.dao")
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"com.cloud"})
public class AdminApp {
    public static void main(String[] args) {
        SpringApplication.run(AdminApp.class, args);
    }
}
