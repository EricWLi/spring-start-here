package com.ericwli.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ericwli.model.Comment;
import com.ericwli.proxies.CommentNotificationProxy;
import com.ericwli.repositories.CommentRepository;

@Component
public class CommentService {
    // Approach 1: Mark the dependent fields with @Autowired

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private CommentNotificationProxy commentNotificationProxy;

    // Approach 2: Mark the constructor with @Autowired
    // @Autowired
    // public CommentService(
    //     CommentRepository commentRepository, 
    //     CommentNotificationProxy commentNotificationProxy
    // ) {
    //     this.commentRepository = commentRepository;
    //     this.commentNotificationProxy = commentNotificationProxy;
    // }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

    // Approach 3: Mark the setters with @Autowired
    // @Autowired
    // public void setCommentRepository(CommentRepository commentRepository) {
    //     this.commentRepository = commentRepository;
    // }

    // @Autowired
    // public void setCommentNotificationProxy(CommentNotificationProxy commentNotificationProxy) {
    //     this.commentNotificationProxy = commentNotificationProxy;
    // }
}
