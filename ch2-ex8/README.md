
# Chapter 2: Exercise 8

## Programmatically adding beans to the Spring context
You can add new instances to the context directly by calling a method of the 
context instance. This approach is used for when you want to implement a 
custom way of adding beans to the context, and @Bean or the stereotype
annotations are not enough for your needs.

For example, you can do the following:
```
if (condition) {
    registerBean(b1);
} else {
    registerBean(b2);
}
```