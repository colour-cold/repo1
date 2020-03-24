package com.colour_cold.spring_mission.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {

    //在一个特定时间执行这个方法
    @Scheduled(cron = "0/2 * * * * *")
    public void hello() {
        System.out.println("hello,你被执行了");
    }
}
