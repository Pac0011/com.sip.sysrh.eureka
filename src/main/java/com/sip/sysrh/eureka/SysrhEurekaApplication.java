package com.sip.sysrh.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SysrhEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SysrhEurekaApplication.class, args);
	}

}
