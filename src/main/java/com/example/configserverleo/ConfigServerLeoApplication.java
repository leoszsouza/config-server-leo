package com.example.configserverleo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerLeoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerLeoApplication.class, args);
	}

}
