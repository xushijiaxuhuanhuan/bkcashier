package com.clare.bkcashier;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.clare.bkcashier.repository.dao")
public class BkcashierApplication {

	public static void main(String[] args) {
		SpringApplication.run(BkcashierApplication.class, args);
	}

}
