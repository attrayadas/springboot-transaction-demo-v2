package com.attraya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringbootTransactionDemoV2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTransactionDemoV2Application.class, args);
	}

}
