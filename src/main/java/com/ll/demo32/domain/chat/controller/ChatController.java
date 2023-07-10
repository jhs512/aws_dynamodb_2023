package com.ll.demo32.domain.chat.controller;

import com.ll.demo32.domain.chat.entity.ChatMessage;
import com.ll.demo32.domain.chat.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
@RequiredArgsConstructor
public class ChatController {
    private final ChatService chatService;

    @GetMapping("/create/{chatRoomId}")
    @ResponseBody
    public ChatMessage create(@PathVariable long chatRoomId, String message) {
        return chatService.write(chatRoomId, message);
    }
}
