
# Chapter 2: Exercise 7

## Managing an instance after its creation
Unlike the @Bean annotation, you do not have full control over instance
creation when using stereotype annotations.

If we want to execute some commands after Spring creates the instance,
we use the @PostConstruct annotation.

The following Maven dependency is required for @PostConstruct:
```
<dependency>
   <groupId>javax.annotation</groupId>
   <artifactId>javax.annotation-api</artifactId>
   <version>1.3.2</version>
</dependency>
```