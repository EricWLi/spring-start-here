package com.ericwli.proxies;

import org.springframework.stereotype.Component;

import com.ericwli.model.Comment;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("[Email Notification] Sending notification for comment: " + comment.getText());
    }
    
}
