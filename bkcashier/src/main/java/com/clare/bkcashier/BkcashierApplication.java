package com.clare.bkcashier;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.clare.bkcashier.repository.dao")
@SpringBootApplication
public class BkcashierApplication {

	public static void main(String[] args) {
		SpringApplication.run(BkcashierApplication.class, args);
	}

}
