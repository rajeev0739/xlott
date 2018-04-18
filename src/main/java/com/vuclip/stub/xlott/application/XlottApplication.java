package com.vuclip.stub.xlott.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication() 
@ComponentScans(@ComponentScan(basePackages= {"com.vuclip"}))
public class XlottApplication {
	public static void main(String[] args) {
		SpringApplication.run(XlottApplication.class, args);
	}
}
