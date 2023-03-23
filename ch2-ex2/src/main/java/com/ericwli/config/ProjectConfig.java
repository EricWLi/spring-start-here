package com.ericwli.config;

import com.ericwli.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    // Typically, method names would have a verb.
    // However, we do not follow this convention for creating beans.
    // The method's name becomes the bean's name.
    @Bean
    Parrot parrot() {
        return new Parrot("Polly");
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
