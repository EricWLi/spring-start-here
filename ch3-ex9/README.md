# Chapter 3: Exercise 9

## 3.4 Choosing from multiple beans in the Spring context while using @Autowire

1. If the identifier of the parameter matches the name of one of the beans from the context, then Spring will choose
the bean with the same name as the parameter. (Not recommended)
2. If not, then it will choose the bean marked with the @Primary annotation.
3. If no beans are marked with the @Primary annotation, then it will select a specific bean using the @Qualifier
annotation.
4. Otherwise, Spring will fail with an exception saying that it contains more than one bean of the same type.