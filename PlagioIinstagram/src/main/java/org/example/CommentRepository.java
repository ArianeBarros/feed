package org.example;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CommentRepository {

    public Optional<Comment> addComment(){
        return null;
    }

    public Optional<List<Comment>> getCommentsByPostId(){
        return null;
    }
}
