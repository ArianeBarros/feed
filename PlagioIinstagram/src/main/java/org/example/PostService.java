package org.example;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Optional<Post> getPostById(){
        return postRepository.getPostById();
    }

    public Optional<List<Post>> getPosts() {
        return postRepository.getPosts();
    }

    public Optional<Post> addPost() {
        return postRepository.addPost();
    }

}
