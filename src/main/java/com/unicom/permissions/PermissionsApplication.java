package com.unicom.permissions;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.unicom.*")//扫描该包下的class 主要是mybatis的持久化类
public class PermissionsApplication {
	public static void main(String[] args) {
		SpringApplication.run(PermissionsApplication.class, args);
	}
}
