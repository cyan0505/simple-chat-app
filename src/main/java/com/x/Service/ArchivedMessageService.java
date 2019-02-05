package com.x.Service;

import com.x.repositories.ArchivedMessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArchivedMessageService {

    private final ArchivedMessageRepo archivedMessageRepo;

    @Autowired
    public ArchivedMessageService(ArchivedMessageRepo archivedMessageRepo){
        this.archivedMessageRepo = archivedMessageRepo;
    }
}
