/*
 * FileName: UserController.java
 * Author:   zzw
 * Date:     2018年04月14日
 * Description: 用户控制器
 */
package com.zzw.user.provider.controller;

import com.zzw.user.provider.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈用户控制器〉<br>
 * 〈用户控制器〉
 *
 * @author zzw
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private List<User> users = new ArrayList<>();

    @PutMapping("/save")
    public Boolean save(@RequestBody User user){
        users.add(user);
        return Boolean.TRUE;
    }

    @GetMapping("/getAll")
    public List<User> getAll(){
        return users;
    }

}
