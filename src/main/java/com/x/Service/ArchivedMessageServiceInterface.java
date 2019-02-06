package com.x.Service;

import com.x.Model.ChatMessage;

import java.util.List;

public interface ArchivedMessageServiceInterface {

    void addNewArchivedMessage(String content, String sender, String messageType);
    List<ChatMessage> getAllArchivedMessages();

}