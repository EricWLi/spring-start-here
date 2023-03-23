package com.ericwli;

import com.ericwli.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

/**
 * Exercise from Spring Start Here
 * Chapter 2: Exercise 7
 */

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot x = new Parrot();
        x.setName("Kiki");

        Supplier<Parrot> parrotSupplier = () -> x;
        context.registerBean("parrot1", Parrot.class, parrotSupplier, bc -> bc.setPrimary(true));

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.getName());

    }
}