package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("你好3");
        //他们俩冲突了

		System.out.println("你好3");



		System.out.println("你好5");
        //你俩冲突了
		System.out.println("你好3");
		System.out.println("你好3");System.out.println("你好3");
		System.out.println("你好3");System.out.println("你好3");

		SpringApplication.run(DemoApplication.class, args);
	}

}
