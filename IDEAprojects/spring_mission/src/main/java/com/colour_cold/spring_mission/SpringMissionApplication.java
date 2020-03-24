package com.colour_cold.spring_mission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync    //开启异步功能的注解
@EnableScheduling   //开启定时功能的注解
public class SpringMissionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMissionApplication.class, args);
    }

}
