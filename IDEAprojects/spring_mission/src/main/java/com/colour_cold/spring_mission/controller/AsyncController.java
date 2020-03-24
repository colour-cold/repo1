package com.colour_cold.spring_mission.controller;

import com.colour_cold.spring_mission.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {
    @Autowired
    AsyncService asyncService;
    @RequestMapping("/hello")
    public String hello() {
        asyncService.service();
        return "hello";
    }
}
