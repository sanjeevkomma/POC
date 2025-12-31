package com.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @PostMapping
    public Map<String, Object> createOrder(@RequestBody Map<String, Object> order) {

        WebClient client = WebClient.create("http://localhost:8001");

        Map response = client.post()
                .uri("/analyze")
                .bodyValue(order)
                .retrieve()
                .bodyToMono(Map.class)
                .block();

        return response;
    }
}
