package org.example;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Optional<Comment> addComment(){
        return commentRepository.addComment();
    }

    public Optional<List<Comment>> getCommentsByPostId(){
        return commentRepository.getCommentsByPostId();
    }
}
