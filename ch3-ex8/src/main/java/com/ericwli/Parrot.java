package com.ericwli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Parrot {
    private String name = "Koko";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("[Parrot name=%s]", name);
    }
}
