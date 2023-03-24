# Chapter 4: Exercise 3

## Different ways of using dependency injection with abstraction
- Mark field with @Autowired
- Mark constructor with @Autowired
- Mark setter method with @Autowired

### Example 1: Mark the dependent field with @Autowired
```java
@Autowired
private CommentRepository commentRepository;

@Autowired
private CommentNotificationProxy commentNotificationProxy;
```

### Example 2: Mark constructor with @Autowired
```java
@Autowired
public CommentService(
    CommentRepository commentRepository, 
    CommentNotificationProxy commentNotificationProxy
) {
    this.commentRepository = commentRepository;
    this.commentNotificationProxy = commentNotificationProxy;
}
```

### Example 3: Mark the setters with @Autowired
```java
@Autowired
public void setCommentRepository(CommentRepository commentRepository) {
    this.commentRepository = commentRepository;
}

@Autowired
public void setCommentNotificationProxy(CommentNotificationProxy commentNotificationProxy) {
    this.commentNotificationProxy = commentNotificationProxy;
}
```