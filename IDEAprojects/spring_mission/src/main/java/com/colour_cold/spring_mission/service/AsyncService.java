package com.colour_cold.spring_mission.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Async
public class AsyncService {
    public void service() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("数据处理完成");
    }
}
