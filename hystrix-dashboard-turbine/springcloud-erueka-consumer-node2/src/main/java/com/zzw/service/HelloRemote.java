package com.zzw.service;

import com.zzw.service.impl.HelloRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zzw
 * @see
 * @since 2018/2/7
 */
@FeignClient(name= "spring-cloud-producer2",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    public String hello2(@RequestParam(value = "name") String name);
}