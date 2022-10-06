package com.magic.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "业务相关")
@Slf4j
@RestController
@RequestMapping(value = "/api/V1/business", produces = MediaType.APPLICATION_JSON_VALUE)
public class BusinessController {

    @SneakyThrows
    @GetMapping()
    @ApiOperation(value = "business two", notes = "business two", produces = "application/json")
    public String business() {
        log.info("business two");
        Thread.sleep(2000);
        return "business two";
    }

}
