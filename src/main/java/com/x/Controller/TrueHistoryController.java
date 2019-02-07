package com.x.Controller;

import com.google.gson.Gson;
import com.x.Model.ChatMessage;
import com.x.Service.ArchivedMessageServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrueHistoryController {

    private ArchivedMessageServiceInterface archivedMessageServiceInterface;

    @Autowired
    public TrueHistoryController(ArchivedMessageServiceInterface archivedMessageServiceInterface) {
        this.archivedMessageServiceInterface = archivedMessageServiceInterface;
    }

    @GetMapping(path = "/history")
    private String passMessageHistory(){
        List<ChatMessage> historyList = this.archivedMessageServiceInterface.getAllArchivedMessages();
        Gson gson = new Gson();
        return gson.toJson(historyList);
    }
}
