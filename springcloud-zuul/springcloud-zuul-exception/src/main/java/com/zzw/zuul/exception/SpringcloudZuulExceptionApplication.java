package com.zzw.zuul.exception;

import com.netflix.zuul.FilterProcessor;
import com.zzw.zuul.exception.error.BusinessErrorAttributes;
import com.zzw.zuul.exception.processor.MyFilterProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class SpringcloudZuulExceptionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZuulExceptionApplication.class, args);
    }

    @Bean
    public BusinessErrorAttributes businessErrorAttributes(){
        return new BusinessErrorAttributes();
    }

    // 自定义过滤器处理器
    @Bean
    public FilterProcessor filterProcessor(){
        FilterProcessor.setProcessor(new MyFilterProcessor());
        return new FilterProcessor();
    }

    // 结合配置中心
    // 动态刷新路由信息
    @RefreshScope
    @ConfigurationProperties("zuul")
    public ZuulProperties zuulProperties(){
        return new ZuulProperties();
    }
}
