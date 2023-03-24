package com.ericwli.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.ericwli.proxies", "com.ericwli.repositories", "com.ericwli.services" })
public class ProjectConfig {
    
}
