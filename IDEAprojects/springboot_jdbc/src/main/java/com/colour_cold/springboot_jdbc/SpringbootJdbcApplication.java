package com.colour_cold.springboot_jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringbootJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJdbcApplication.class, args);
    }

}
