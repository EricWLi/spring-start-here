package com.ericwli;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name;

    public Parrot() {
    }

    public Parrot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
