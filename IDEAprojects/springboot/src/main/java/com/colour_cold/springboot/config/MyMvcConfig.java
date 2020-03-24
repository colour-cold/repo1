package com.colour_cold.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

//如果要扩展SpringMvc官方推荐我们这么做
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    //视图跳转
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/lsd").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/main.html").setViewName("dashboard");
    }

    //自定义国际化组件生效了
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }

    //自定义拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/", "/index.html", "/user/login", "/css/*", "/js/**", "/img/**");
    }
}
