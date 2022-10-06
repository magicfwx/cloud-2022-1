package com.magic.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "index相关")
@Slf4j
@RestController
@RequestMapping(value = "/api/V1/index", produces = MediaType.APPLICATION_JSON_VALUE)
public class IndexController {

    @SneakyThrows
    @GetMapping()
    @ApiOperation(value = "index two", notes = "index two", produces = "application/json")
    public String index() {
        log.info("index two");
        Thread.sleep(2000);
        return "index two";
    }

}
