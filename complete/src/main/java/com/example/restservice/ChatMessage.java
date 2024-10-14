package com.example.restservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {
    @JsonProperty("content")
    private String content;

    @JsonProperty("sender")
    private String sender;


    // Getters and Setters
}