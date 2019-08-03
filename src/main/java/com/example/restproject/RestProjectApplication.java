package com.example.restproject;

import com.example.restproject.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties(FileStorageProperties.class)
public class RestProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestProjectApplication.class, args);
    }

}
