package com.danalves.ms_client_2.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @GetMapping("/list")
    public ResponseEntity<String> listAnimals() {
        return ResponseEntity.ok("List of Animals from Client 2");
    }
}
