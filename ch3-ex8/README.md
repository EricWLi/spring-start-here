# Chapter 3: Exercise 8

## 3.4 Choosing from multiple beans in the Spring context

1. If the identifier of the parameter matches the name of one of the beans from the context, then Spring will choose
the bean with the same name as the parameter. (Not recommended)
2. If not, then it will choose the bean marked with the @Primary annotation.
3. If no beans are marked with the @Primary annotation, then it will select a specific bean using the @Qualifier
annotation.
4. Otherwise, Spring will fail with an exception saying that it contains more than one bean of the same type.

---

Case 1: Parameter name is same as bean name
```
@Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean
    public Person person(Parrot parrot2) {
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot2);
        return p;
    }
```

Case 2: Using @Primary
```
@Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    @Primary
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean
    public Person person(Parrot parrot) {
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot2);
        return p;
    }
```

Case 3: Using @Qualifier
```
@Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean
    public Person person(@Qualifier("parrot2") Parrot parrot) {
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot);
        return p;
    }
```