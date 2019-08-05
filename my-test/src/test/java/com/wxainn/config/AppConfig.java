package com.wxainn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.wxainn")
public class AppConfig {

    @Bean
    public String str() {
        return "just a String";
    }
}
