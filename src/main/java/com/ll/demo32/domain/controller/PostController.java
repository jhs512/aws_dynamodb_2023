package com.ll.demo32.domain.controller;

import com.ll.demo32.domain.entity.Post;
import com.ll.demo32.domain.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/create")
    @ResponseBody
    public Post create() {
        return postService.write("제목");
    }

    @GetMapping("")
    @ResponseBody
    public List<Post> posts() {
        return postService.findAll();
    }

    @GetMapping("{id}/{createDate}")
    @ResponseBody
    public Post post(@PathVariable String id, @PathVariable String createDate) {
        return postService.findByIdAndCreateDate(id, createDate).orElse(null);
    }
}
