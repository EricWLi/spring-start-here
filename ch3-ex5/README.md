# Chapter 3: Exercise 5

## 3.2.2 Using @Autowired to inject the value through the constructor

- Recommended for production code.
- Allows you to define the field as final.
- Useful for writing specific unit tests where you do not want to rely on Spring to inject the field for you.

```

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    ...
    
    private Parrot parrot;

    @Autowired
    public Person(Parrot parrot) {
        this.parrot = parrot;
    }

    ...
}
```