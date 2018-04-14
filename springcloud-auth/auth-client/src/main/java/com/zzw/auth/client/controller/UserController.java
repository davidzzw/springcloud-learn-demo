/*
 * FileName: UserController.java
 * Author:   zzw
 * Date:     2018年04月11日
 * Description: 用户
 */
package com.zzw.auth.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * 〈用户〉<br>
 * 〈用户〉
 *
 * @author zzw
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
@RestController
public class UserController {

    @GetMapping("/user/me")
    public Principal user(Principal principal) {
        return principal;
    }
}
