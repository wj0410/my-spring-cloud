package com.wj.limit;

import io.github.wj0410.core.tools.redis.RedisLockHelper;
import io.github.wj0410.core.tools.restful.exception.ExceptionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LimitApplication {

    public static void main(String[] args) {
        SpringApplication.run(LimitApplication.class,args);
    }

    // 全局异常处理
    @Bean
    public ExceptionController exceptionController(){
        return new ExceptionController();
    }

    // redis分布式锁
    @Bean
    public RedisLockHelper redisLockHelper(){
        return new RedisLockHelper();
    }

}
