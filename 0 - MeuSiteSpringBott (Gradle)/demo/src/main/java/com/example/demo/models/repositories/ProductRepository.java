package com.example.demo.models.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.ProductModels;

@Repository //Gerenciamento de dados
public interface ProductRepository extends JpaRepository<ProductModels, UUID>{
    
}
