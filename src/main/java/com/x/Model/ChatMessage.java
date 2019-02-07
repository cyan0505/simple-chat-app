package com.x.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "messages")
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long messageId;
    private String content;
    private String sender;
    private String type;
    private String sendTime;

    public ChatMessage(){}

    public ChatMessage(String content, String sender, String type, String sendTime){
        this.content = content;
        this.sender = sender;
        this.type = type;
        this.sendTime = sendTime;
    }
}