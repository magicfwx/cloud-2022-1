package com.magic.user.config;

import io.swagger.annotations.ApiOperation;
import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


/**
 * dev环境开启swagger文档【启用swagger之前，请配置如下三个变量swagger.enable,swagger.title,swagger.basePackage】
 */
@Configuration
@ConditionalOnProperty(name = "knife4j.enable", havingValue = "true")
@ConfigurationProperties(prefix = "knife4j")
@Data
@Profile({"!prod", "!pro"})
@Import(BeanValidatorPluginsConfiguration.class)
public class Swagger3Config {
    /**
     * swagger的标题
     */
    private String title;

    @Bean
    public Docket createRestApiBySwagger() {
        Docket docket = new Docket(DocumentationType.OAS_30);
        return docket.pathMapping("/")
                .apiInfo(new ApiInfoBuilder().title(title).version("1.0").build())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

}