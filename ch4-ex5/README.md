# Chapter 4: Exercise 5

## 4.2.2 Choosing what to auto-wire from multiple implementations of an abstraction

If we have multiple implementations of the same interface, we have to instruct
Spring which is the implementation it should inject.

1. Use the @Primary annotation to mark one of the implementations as the default
```
@Component
@Primary
public class CommentPushNotificationProxy implements CommentNotificationProxy {
    ...
}
```
2. Use the @Qualifier annotation to refer to a bean by name
