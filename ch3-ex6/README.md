# Chapter 3: Exercise 6

## 3.2.3 Using dependency injection through the setter
- Usually not recommended
- Cannot make field final
- Difficult to read
- Does not make testing easier

```
package com.ericwli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    ...
    
    private Parrot parrot;

    @Autowired
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
    
    ...
}

```