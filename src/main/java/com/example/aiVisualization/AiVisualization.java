package com.example.aiVisualization;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.aiVisualization.dao")
public class AiVisualization {

    public static void main(String[] args) {
        SpringApplication.run(AiVisualization.class, args);
    }

}
