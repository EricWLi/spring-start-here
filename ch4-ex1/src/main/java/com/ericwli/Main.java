package com.ericwli;

import com.ericwli.model.Comment;
import com.ericwli.proxies.CommentNotificationProxy;
import com.ericwli.proxies.EmailCommentNotificationProxy;
import com.ericwli.repositories.CommentRepository;
import com.ericwli.repositories.DBCommentRepository;
import com.ericwli.services.CommentService;

public class Main {
    public static void main(String[] args) {
        CommentRepository commentRepository = new DBCommentRepository();
        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();

        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);
        
        Comment comment = new Comment();
        comment.setAuthor("Eric Li");
        comment.setText("Hello!");

        commentService.publishComment(comment);
    }
}
