package com.ericwli.repositories;

import org.springframework.stereotype.Repository;

import com.ericwli.model.Comment;

@Repository
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
    
}
