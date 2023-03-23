package com.ericwli;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

public class Parrot {
    private String name;

    public Parrot() {
    }

    @PostConstruct
    public void init() {
        this.name = "Kiki";
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
