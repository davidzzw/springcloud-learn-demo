package com.zzw.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzw
 * @see
 * @since 2018/2/11
 */
@RestController
@RefreshScope
public class HelloController  {

    @Value("${message}")
    private String message ;

    @RequestMapping("/hello")
    public String from() {
        return this.message;
    }
}
