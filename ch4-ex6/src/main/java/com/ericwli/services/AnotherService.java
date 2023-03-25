package com.ericwli.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ericwli.model.Comment;
import com.ericwli.proxies.CommentNotificationProxy;

@Component
public class AnotherService {
    private final CommentNotificationProxy commentNotificationProxy;

    public AnotherService(@Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void sendNotification(Comment comment) {
        commentNotificationProxy.sendComment(comment);
    }
}
