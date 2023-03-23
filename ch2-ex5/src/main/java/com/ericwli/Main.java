package com.ericwli;

import com.ericwli.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Exercise from Spring Start Here
 * Chapter 2: Exercise 4
 */

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName()); // should print "Miki"
    }
}