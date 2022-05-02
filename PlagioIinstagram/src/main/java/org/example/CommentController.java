package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping(value="/posts")
    public ResponseEntity<Comment> addComment(){
        return commentService.addComment().map(ResponseEntity::ok)
                .orElseThrow(this::getResourceNotFound);
    }

    @PostMapping(value="")
    public ResponseEntity<List<Comment>> getCommentsByPostId(){
        return commentService.getCommentsByPostId().map(ResponseEntity::ok)
                .orElseThrow(this::getResourceNotFound);
    }

    private ResourceNotFound getResourceNotFound(){
        throw new ResourceNotFound("Comment not found");
    }
}
