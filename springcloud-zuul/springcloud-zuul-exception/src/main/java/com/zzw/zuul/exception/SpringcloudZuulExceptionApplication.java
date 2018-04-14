package com.zzw.zuul.exception;

import com.zzw.zuul.exception.error.BusinessErrorAttributes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringcloudZuulExceptionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZuulExceptionApplication.class, args);
    }

    @Bean
    public BusinessErrorAttributes businessErrorAttributes(){
        return new BusinessErrorAttributes();
    }
}
