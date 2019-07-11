package com.aiseot.oom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.aiseot.oom.markservice.dao")
@SpringBootApplication
public class oom {

	public static void main(String[] args) {
		SpringApplication.run(oom.class, args);
	}



}
