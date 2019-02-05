package com.x.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "messages")
public class ArchivedMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long messageId;
    private String content;
    private String sender;
    private String sendTime;

    public ArchivedMessage(String content, String sener, String sendTime){
        this.content = content;
        this.sender = sener;
        this.sendTime = sendTime;
    }
}
