package com.ydtk.soft;

import javax.servlet.MultipartConfigElement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

@SpringBootApplication
@MapperScan("com.ydtk.soft.mapper")
@Configuration
public class SoftApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoftApplication.class, args);
	}

}
