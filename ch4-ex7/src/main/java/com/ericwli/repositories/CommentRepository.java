package com.ericwli.repositories;

import com.ericwli.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
