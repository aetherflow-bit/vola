package com.example.chatapp.dto;

import lombok.Data;

@Data
public class ChatMessageRequest {
    private Long senderId;
    private Long recipientId;
    private String content;
}
