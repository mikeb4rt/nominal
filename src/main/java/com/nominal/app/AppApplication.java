package com.nominal.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication (exclude = { SecurityAutoConfiguration.class })
@EntityScan("com.nominal.app.model")
public class AppApplication  extends SpringBootServletInitializer {



    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

}
