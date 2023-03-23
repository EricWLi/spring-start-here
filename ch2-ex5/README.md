
# Chapter 2: Exercise 5

## Defining a bean as primary
If you have multiple beans of the same class, you can define one of the beans
can be defined as the primary bean.

This is done with the @Primary annotation.

```
@Bean
@Primary
Parrot parrot2() {
    p.setName("Miki");
    return p;
}
```