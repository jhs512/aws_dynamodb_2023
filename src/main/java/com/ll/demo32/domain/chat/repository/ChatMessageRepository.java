package com.ll.demo32.domain.chat.repository;

import com.ll.demo32.domain.chat.entity.ChatMessage;
import org.springframework.stereotype.Repository;

@Repository
public class ChatMessageRepository {
    public ChatMessage save(ChatMessage chatMessage) {
        return chatMessage;
    }
}
