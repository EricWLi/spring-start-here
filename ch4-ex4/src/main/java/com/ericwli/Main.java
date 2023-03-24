package com.ericwli;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ericwli.config.ProjectConfig;
import com.ericwli.model.Comment;
import com.ericwli.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var comment = new Comment();
        comment.setAuthor("Eric Li");
        comment.setText("Hello world!");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);

        context.close();
    }
}
