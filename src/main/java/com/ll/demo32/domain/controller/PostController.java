package com.ll.demo32.domain.controller;

import com.ll.demo32.domain.entity.Post;
import com.ll.demo32.domain.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/create")
    @ResponseBody
    public Post create() {
        return postService.write("제목");
    }
}
