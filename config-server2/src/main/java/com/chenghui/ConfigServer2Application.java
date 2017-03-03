package com.chenghui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableDiscoveryClient //新增@EnableDiscoveryClient注解，用来将config-server注册到配置的服务注册中心上去
@EnableConfigServer //添加@EnableConfigServer注解，开启Config Server
@SpringBootApplication
public class ConfigServer2Application {

	public static void main(String[] args) { 
		SpringApplication.run(ConfigServer2Application.class, args);
	}
}
