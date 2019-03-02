package com.example.projetagile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Configuration
@Import(SwaggerConfig.class)
public class ProjetagileApplication  {


  public static void main(String[] args) {
    SpringApplication.run(ProjetagileApplication.class, args);
  }

}