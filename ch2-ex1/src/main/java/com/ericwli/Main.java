package com.ericwli;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Exercise from Spring Start Here
 * Chapter 2: Exercise 1
 */

public class Main {
    public static void main(String[] args) {
        // Creates instance of the Spring context.
        var context = new AnnotationConfigApplicationContext();

        Parrot parrot = new Parrot();
    }
}