package com.ericwli.proxies;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.ericwli.model.Comment;

@Component
@Primary
public class CommentPushNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("[Push Notification] Sending notification for comment: " + comment.getText());
    }
    
}
