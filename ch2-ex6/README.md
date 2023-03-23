
# Chapter 2: Exercise 6

Steps to use stereotype annotations
1. Mark the classes that you want Spring to handle with the @Component annotation.
Spring will create an instance of the class and add it to the context.
2. Add the @ComponentScan annotation to the configuration class, which will instruct
Spring on where to find the classes you marked.

## Using the @Bean annotation vs. Using stereotype annotations

### Using the @Bean annotation
1. You have complete control over the instances added to the Spring Context. This means that it is your responsibility to create and configure the instance in the method annotated with @Bean.

2. You can add multiple instances of the same type to the Spring context.

3. You can add any type to the Spring context. The class that defines the instance does not have to be in your class.

4. A separate method for each bean needs to be created, adding additional lines of code to your project.

### Using stereotype annotations
1. You only have control of the instance after the framework creates it.

2. You can only add one instance of the class to the context.

3. You can only use stereotype annotations on classes that your appliation owns.

4. Using stereotype annotations do not add boilerplate code to your app.