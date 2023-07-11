package com.ll.demo32.domain.chat.controller;

import com.ll.demo32.domain.chat.entity.ChatMessage;
import com.ll.demo32.domain.chat.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/{chatRoomId}/messages")
    @ResponseBody
    public List<ChatMessage> messages(@PathVariable long chatRoomId) {
        return chatService.findChatMessagesByChatRoomId(chatRoomId);
    }

    @GetMapping("/{chatRoomId}/messages/{createDate}")
    @ResponseBody
    public List<ChatMessage> messages(@PathVariable long chatRoomId, @PathVariable String createDate) {
        return chatService.findChatMessagesByChatRoomIdAndCreateDateStartsWith(chatRoomId, createDate);
    }
}
