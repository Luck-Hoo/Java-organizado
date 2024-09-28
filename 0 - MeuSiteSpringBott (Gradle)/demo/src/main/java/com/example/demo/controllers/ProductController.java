package com.example.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.beans.BeanUtils;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.ProductRecordDTO;
import com.example.demo.models.ProductModels;
import com.example.demo.models.repositories.ProductRepository;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController //Implementação de endpoint REST
@RequestMapping("/api/products")
public class ProductController {
    
    @Autowired
    ProductRepository productRepository;

    @PostMapping
    public ResponseEntity<ProductModels> saveProduct(@RequestBody @Valid ProductRecordDTO productRecordDTO) {
        //TODO: process POST request
        var productModels = new ProductModels(); //nova implementação do var
        BeanUtils.copyProperties(productRecordDTO, productModels); //Fz a conversão do productRocordDTO para productModels
        
        return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(productModels)); //Reorna o status e salva o productRepository
    }
    
}
