package com.demo.controller;

import com.demo.model.Message;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Greetings API")
public class GreetingsController {

    @GetMapping("/say-hello")
    @ApiOperation(value = "Get a hello greeting", response = Message.class)
    Message sayHello() {
        return new Message("Hello World!");
    }
}
