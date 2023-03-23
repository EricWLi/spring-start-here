
# Chapter 2: Exercise 6

Steps to use stereotype annotations
1. Mark the classes that you want Spring to handle with the @Component annotation.
Spring will create an instance of the class and add it to the context.
2. Add the @ComponentScan annotation to the configuration class, which will instruct
Spring on where to find the classes you marked.