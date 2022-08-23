package com.spring.swagger.swaggerpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class SwaggerPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerPocApplication.class, args);
    }

}
