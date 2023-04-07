package com.psj24680.wadview_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class WadViewBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(WadViewBackApplication.class, args);
    }

}
