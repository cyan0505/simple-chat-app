package com.x.Service;

import com.x.Model.ChatMessage;
import com.x.repositories.ArchivedMessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ArchivedMessageService implements ArchivedMessageServiceInterface {

    private final ArchivedMessageRepo archivedMessageRepo;

    @Autowired
    public ArchivedMessageService(ArchivedMessageRepo archivedMessageRepo){
        this.archivedMessageRepo = archivedMessageRepo;
    }

    @Override
    public void addNewArchivedMessage(String content, String sender, String messageType){
        ChatMessage archivedMessage = new ChatMessage(content, sender, messageType, LocalDateTime.now().toString());
        this.archivedMessageRepo.save(archivedMessage);
    }

    @Override
    public List<ChatMessage> getAllArchivedMessages(){
        return (List<ChatMessage>) this.archivedMessageRepo.findAll();
    }

}
