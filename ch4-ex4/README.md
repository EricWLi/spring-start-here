# Chapter 4: Exercise 4

## Autowiring through the parameters of the @Bean annotated methods, with abstractions

```java
@Bean
public CommentRepository commentRepository() {
    return new DBCommentRepository();
}

@Bean
public CommentNotificationProxy commentNotificationProxy() {
    return new EmailCommentNotificationProxy();
}

@Bean
public CommentService commentService(
    CommentRepository commentRepository,
    CommentNotificationProxy commentNotificationProxy
) {
    return new CommentService(commentRepository, commentNotificationProxy);
}
```