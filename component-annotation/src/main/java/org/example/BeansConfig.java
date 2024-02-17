package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Configuration
@ComponentScan(basePackages = "org.example")
public class BeansConfig {

    @Bean
    public Employee getEmployee() {
        System.out.println("called ori emp in beans config class=");
        return new Employee();
    }

    @Bean
    @Primary
    public Employee getOnemoreEmployee() {
        System.out.println("called DUP emp in beans config class=");
        return new Employee();
    }
}
