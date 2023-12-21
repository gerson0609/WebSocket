package com.example.socket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ChatController {
    @GetMapping("/")
    public String showChatPage() {
        return "chat";
    }
    
}
