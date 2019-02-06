package com.x.Controller;

import com.x.Model.ArchivedMessage;
import com.x.Model.ChatMessage;
import com.x.Service.ArchivedMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;

@Controller
public class ChatController {

    private final ArchivedMessageService archivedMessageService;

    @Autowired
    public ChatController(ArchivedMessageService archivedMessageService){
        this.archivedMessageService = archivedMessageService;
    }

    @MessageMapping("/chat.register")
    @SendTo("/topic/public")
    public ChatMessage register(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor){
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }

    @MessageMapping("/chat.send")
    @SendTo("/topic/public")
    public ChatMessage sendMessage(@Payload ChatMessage chatMessage){
        archivedMessageService.addNewArchivedMessage(chatMessage.getContent(), chatMessage.getSender());
        return chatMessage;
    }
}
