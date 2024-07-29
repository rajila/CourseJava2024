package com.rdajila.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("classpath:test.properties")
@PropertySource("file:/tmp/tproperties/test.properties")
@ConfigurationPropertiesScan
public class UsersAppApplication {

	public static void main(String[] args) {
            SpringApplication.run(UsersAppApplication.class, args);
	}

}
