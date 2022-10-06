package com.magic.gateway.boot;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

@Slf4j
@SpringBootApplication(
        scanBasePackages = {
                "com.magic.gateway",
        }//, scanBasePackageClasses = Swagger3Config.class
        , exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class}
)
@EnableDiscoveryClient
@Configuration
public class MagicGatewayApplication {

    public static void main(String[] args) {
        try {
            System.setProperty("csp.sentinel.app.type", "1");
            SpringApplication.run(MagicGatewayApplication.class, args);
        } catch (Exception e) {
            log.error("MagicGatewayApplication error: {}", e.getMessage(), e);
        }
    }
}
