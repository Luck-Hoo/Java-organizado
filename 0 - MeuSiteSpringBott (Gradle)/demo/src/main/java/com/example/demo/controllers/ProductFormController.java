package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProductFormController {
    
    @GetMapping("/products/form")
    public ModelAndView showForm() {
        return new ModelAndView("product-form"); // Nome do arquivo HTML em src/main/resources/templates
    }
    
}
