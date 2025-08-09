package com.example.service;

import com.example.dto.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostService {

    private final String BASE_URL = "https://jsonplaceholder.typicode.com/posts";

    @Autowired
    private RestTemplate restTemplate;

    // GET by ID
    public Post getPostById(int id) {
        return restTemplate.getForObject(BASE_URL + "/" + id, Post.class);
    }

    // GET all
    public Post[] getAllPosts() {
        return restTemplate.getForObject(BASE_URL, Post[].class);
    }

    // POST
    public Post createPost(Post post) {
        return restTemplate.postForObject(BASE_URL, post, Post.class);
    }

    // PUT
    public void updatePost(int id, Post post) {
        restTemplate.put(BASE_URL + "/" + id, post);
    }

    // DELETE
    public void deletePost(int id) {
        restTemplate.delete(BASE_URL + "/" + id);
    }
}
