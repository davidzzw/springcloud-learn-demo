package com.zzw.service.impl;

import com.zzw.service.HelloRemote;
import org.springframework.stereotype.Component;

/**
 * @author zzw
 * @see
 * @since 2018/2/8
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String hello2(String name) {
        return "hello" + name + ", this messge send failed";
    }
}
