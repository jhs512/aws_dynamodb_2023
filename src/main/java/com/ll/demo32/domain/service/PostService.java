package com.ll.demo32.domain.service;

import com.ll.demo32.domain.entity.Post;
import com.ll.demo32.domain.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public Post write(String subject) {
        return postRepository.save(
                Post
                        .builder()
                        .subject(subject)
                        .build()
        );
    }
}