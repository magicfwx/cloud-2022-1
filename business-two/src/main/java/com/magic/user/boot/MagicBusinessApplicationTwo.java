package com.magic.user.boot;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import com.magic.user.config.Swagger3Config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

@Slf4j
@SpringBootApplication(
        scanBasePackages = {
                "com.magic.user",
        }
        , scanBasePackageClasses = Swagger3Config.class
)
@EnableKnife4j
@EnableDiscoveryClient
@Configuration
public class MagicBusinessApplicationTwo {

    public static void main(String[] args) {
        try {
            SpringApplication.run(MagicBusinessApplicationTwo.class, args);
        } catch (Exception e) {
            log.error("MagicBusinessApplicationTwo error: {}", e.getMessage(), e);
        }
    }
}