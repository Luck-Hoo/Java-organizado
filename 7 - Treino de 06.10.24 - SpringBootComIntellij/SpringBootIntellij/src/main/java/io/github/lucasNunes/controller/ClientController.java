package io.github.lucasNunes.controller;

import io.github.lucasNunes.service.ClientService;
import io.github.lucasNunes.model.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> clients = clientService.findAll();
        return ResponseEntity.ok(clients);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Client> addClient(@RequestBody Client client) {
        Client savedClient = clientService.save(client);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedClient);
    }
}
