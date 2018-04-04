package com.zzw.client;

import com.zzw.vo.Hello;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zzw
 * @see
 * @since 2018/3/24
 */
@FeignClient(name = "hello", fallback = HystrixClientFallback.class)
public interface HystrixClient {
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    Hello iFailSometimes();
}