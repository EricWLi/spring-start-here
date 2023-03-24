package com.ericwli;

import com.ericwli.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);

        System.out.println("Person: " + person);
        System.out.println("Parrot: " + parrot);
        System.out.println("Person's parrot = " + person.getParrot());
    }
}