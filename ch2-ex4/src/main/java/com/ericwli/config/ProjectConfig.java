package com.ericwli.config;

import com.ericwli.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot1() {
        return new Parrot("Koko");
    }

    @Bean(name = "miki")
    Parrot parrot2() {
        return new Parrot("Miki");
    }

    @Bean
    Parrot parrot3() {
        return new Parrot("Riki");
    }
}
