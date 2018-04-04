package com.zzw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zzw
 * @see
 * @since 2018/3/10
 */
@RestController
public class ClientController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${serviceProviderHost}")
    private String serviceProviderHost;

    @Value("${serviceProviderPort}")
    private String serviceProviderPort;

    @Value("${serivce-provider.name}")
    private String serviceProviderName;

    @GetMapping("/hello")
    public String hello(){
               /* return restTemplate.getForObject("http://" +
                serviceProviderHost + ":" + serviceProviderPort +
                "/hello", String.class);*/
        return restTemplate.getForObject("http://" +
                        serviceProviderName +
                        "/hello",
                String.class);
    }
}
