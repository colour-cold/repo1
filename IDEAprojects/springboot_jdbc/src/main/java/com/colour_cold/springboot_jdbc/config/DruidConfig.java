package com.colour_cold.springboot_jdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;
import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
public class DruidConfig {
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }
    //后台监控
    @Bean
    public ServletRegistrationBean statViewServlet() {
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet());
        //后台需要有人登录，账号密码配置
        HashMap<String, String> initParameters = new HashMap<>();
        //增加配置
        initParameters.put("loginUsername","admin");//登录的key是固定的loginUsername 和 loginPassword
        initParameters.put("loginPassword","123456");
        //允许谁可以访问
        initParameters.put("allow","localhost");
/*       //禁止谁访问 initParameters.put("xxx","ip地址");*/

        bean.setInitParameters(initParameters);//设置初始化参数
        return bean;

    }
}
