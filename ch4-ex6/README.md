# Chapter 4: Exercise 6

## 4.2.2 Choosing what to auto-wire from multiple implementations of an abstraction

If we have multiple implementations of the same interface, we have to instruct
Spring which is the implementation it should inject.

1. Use the @Primary annotation to mark one of the implementations as the default
```java
@Component
@Primary
public class CommentPushNotificationProxy implements CommentNotificationProxy {
    ...
}
```
2. Use the @Qualifier annotation to refer to a bean by name
```java
@Component
@Qualifier("PUSH")
public class CommentPushNotificationProxy implements CommentNotificationProxy {
    ...
}

@Component
public class CommentService {
    ...

    @Autowired
    public CommentService(
        CommentRepository commentRepository, 
        @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy
    ) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }
    ...
}
```