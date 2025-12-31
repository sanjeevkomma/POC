package com.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderController {

    @PostMapping("/order")
    public String process(@RequestParam double amount) throws Exception {

        Process process = Runtime.getRuntime()
                .exec("python analytics.py " + amount);

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()));

        return "Score: " + reader.readLine();
    }


}
