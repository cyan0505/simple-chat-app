package com.x.Controller;

import com.x.Service.ArchivedMessageService;
import com.x.Service.ArchivedMessageServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.security.Principal;

@Controller
public class ChatPageHistoryController {

    private ArchivedMessageServiceInterface archive;

    @Autowired
    ChatPageHistoryController(ArchivedMessageService archive){
        this.archive = archive;
    }

    @GetMapping("/")
    public String sendHistory(Model model, Principal principal){
        model.addAttribute("user", principal.getName());
        return "index";
    }
}
