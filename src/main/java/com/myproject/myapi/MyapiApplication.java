package com.myproject.myapi;

import com.myproject.myapi.dao.ApiLogInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyapiApplication {


	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
	}



}
