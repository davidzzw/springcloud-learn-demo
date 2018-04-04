package com.zzw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudConfigBusClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfigBusClientApplication.class, args);
	}
}
