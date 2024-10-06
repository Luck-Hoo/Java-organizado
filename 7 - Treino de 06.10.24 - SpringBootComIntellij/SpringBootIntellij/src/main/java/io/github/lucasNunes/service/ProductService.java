package io.github.lucasNunes.service;

import io.github.lucasNunes.model.Produto;
import io.github.lucasNunes.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Produto> listarProdutos(){
        return productRepository.findAll();
    }
    public Produto salvarProduto(Produto produto){
        return productRepository.save(produto);
    }
}
