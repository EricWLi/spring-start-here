package com.ericwli.proxies;

import com.ericwli.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}