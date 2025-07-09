package com.varad.Spring_AI;

import org.springframework.ai.chat.client.ChatClient;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenAIController {

//    OpenAiChatModel chatModel;
        ChatClient chatClient;
    public OpenAIController(OpenAiChatModel chatModel){
        //this.chatModel = chatModel;
        this.chatClient = ChatClient.create(chatModel);
    }

    @GetMapping("/api/{message}")
    public ResponseEntity<String> getAnswer(@PathVariable String message){
        String response = chatClient
                .prompt(message)
                .call()
                .content();
        return ResponseEntity.ok(response);
    }
}
