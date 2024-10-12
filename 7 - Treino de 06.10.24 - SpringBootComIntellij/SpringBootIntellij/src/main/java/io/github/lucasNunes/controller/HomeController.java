package io.github.lucasNunes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}
