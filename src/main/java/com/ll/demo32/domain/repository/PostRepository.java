package com.ll.demo32.domain.repository;

import com.ll.demo32.domain.entity.Post;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.UUID;

@Repository
public class PostRepository {
    public Post save(Post post) {
        post.setId(UUID.randomUUID());
        post.setCreateDate(LocalDateTime.now().toString());

        return post;
    }
}
