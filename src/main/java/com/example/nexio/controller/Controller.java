package com.example.nexio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("health")
    String health() {
        return "Ok";
    }



}
