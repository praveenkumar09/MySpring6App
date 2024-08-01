package com.springguru.praveen.MySpring6App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.springguru.praveen.MySpring6App")
public class MySpring6AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpring6AppApplication.class, args);
	}

}
