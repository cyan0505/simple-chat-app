package com.x.Controller;

import com.x.Service.ArchivedMessageService;
import com.x.Service.ArchivedMessageServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatPageHistoryController {

    private ArchivedMessageServiceInterface archive;

    @Autowired
    ChatPageHistoryController(ArchivedMessageService archive){
        this.archive = archive;
    }

    @GetMapping("/home")
    public String sendHistory(Model model){
        model.addAttribute(archive.getAllArchivedMessages());
        return "home";
    }
}
