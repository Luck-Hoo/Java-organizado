package io.github.lucasNunes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.lucasNunes.service.ClientService;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private ClientService clientService;

    @GetMapping("/")
    public String home(Model model) {
        try {
            model.addAttribute("clientes", clientService.findAll());
            return "index";
        } catch (Exception e) {
            logger.error("Error retrieving clients", e);
            model.addAttribute("errorMessage", "Could not retrieve clients.");
            return "error"; // Ensure you have an error.html or similar template
        }
    }
    @GetMapping("/api/users")
    @ResponseBody
    public ResponseEntity<String> getApiUsers(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jsonplaceholder.typicode.com/users";
        try {
            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
            return ResponseEntity.ok(response.getBody()); // Retorna os dados da API como JSON
        } catch (Exception e) {
            logger.error("Error retrieving users from API", e);
            return ResponseEntity.status(500).body("{\"error\":\"Could not retrieve users from API.\"}");
        }
    }
    @GetMapping("/home2")
    public String thymeleaf(){
        return "thymeleaf";
    }
}
