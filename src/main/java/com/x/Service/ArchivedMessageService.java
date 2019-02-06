package com.x.Service;

import com.x.Model.ArchivedMessage;
import com.x.repositories.ArchivedMessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ArchivedMessageService {

    private final ArchivedMessageRepo archivedMessageRepo;

    @Autowired
    public ArchivedMessageService(ArchivedMessageRepo archivedMessageRepo){
        this.archivedMessageRepo = archivedMessageRepo;
    }

    public void addNewArchivedMessage(String content, String sender){
        ArchivedMessage archivedMessage = new ArchivedMessage(content, sender, LocalDateTime.now().toString());
        this.archivedMessageRepo.save(archivedMessage);
    }

}
