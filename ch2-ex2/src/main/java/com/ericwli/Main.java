package com.ericwli;

import com.ericwli.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Exercise from Spring Start Here
 * Chapter 2: Exercise 2
 */

public class Main {
    public static void main(String[] args) {
        // Creates instance of the Spring context.
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());

        String str = context.getBean(String.class);
        System.out.println(str);

        Integer num = context.getBean(Integer.class);
        System.out.println(num);
    }
}