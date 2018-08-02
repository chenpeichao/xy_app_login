package com.hubpd.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

/**
 * 服务启动类
 *
 * @author cpc
 * @create 2018-06-20 16:48
 **/
@EnableAutoConfiguration
@EnableScheduling
@SpringBootApplication
@EnableCaching
@PropertySource(value = {"classpath:config/constant/constant.properties"},encoding="utf-8")
public class XYAppLogin {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(XYAppLogin.class);
        springApplication.run(args);
    }
}
