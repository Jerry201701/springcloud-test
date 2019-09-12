package com.cloud.backup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"com.cloud.backup"})
public class BackupApp {
    public static void main(String[] args) {

            SpringApplication.run(BackupApp.class, args);

    }
}
