package com.x.Controller;

import com.x.Service.ArchivedMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArchivedMessageController {

    private final ArchivedMessageService archivedMessageService;

    @Autowired
    public ArchivedMessageController(ArchivedMessageService archivedMessageService){
        this.archivedMessageService = archivedMessageService;
    }
}
