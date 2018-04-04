package com.zzw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzw
 * @see
 * @since 2018/3/10
 */
@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
