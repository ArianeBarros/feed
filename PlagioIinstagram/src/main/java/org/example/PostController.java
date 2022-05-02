package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping(value="")
    public ResponseEntity<Post> getPostById(){
        return postService.getPostById().map(ResponseEntity::ok)
                .orElseThrow(this::getResourceNotFoundException);
    }

    @GetMapping(value="")
    public ResponseEntity<List<Post>> getPosts(){
        return postService.getPosts().map(ResponseEntity::ok)
                .orElseThrow(this::getResourceNotFoundException);
    }

    @PostMapping(value="")
    public ResponseEntity<Post> addPost(){
        return postService.addPost().map(ResponseEntity::ok)
                .orElseThrow(this::getResourceNotFoundException);
    }

    private ResourceNotFound getResourceNotFoundException() {
        throw new ResourceNotFound("Post não encontrado");
    }
}
