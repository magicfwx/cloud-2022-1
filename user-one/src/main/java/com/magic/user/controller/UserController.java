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
@RequestMapping(value = "/api/V1/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @SneakyThrows
    @GetMapping()
    @ApiOperation(value = "user one", notes = "user one", produces = "application/json")
    public String user() {
        log.info("user one");
        Thread.sleep(2000);
        return "user one";
    }

}
