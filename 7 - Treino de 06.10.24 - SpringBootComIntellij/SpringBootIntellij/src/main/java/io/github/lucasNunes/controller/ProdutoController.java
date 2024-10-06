package io.github.lucasNunes.controller;

import io.github.lucasNunes.model.Produto;
import io.github.lucasNunes.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Produto> listarProdutos(){
        return productService.listarProdutos();
    }
    @PostMapping
    public Produto adicionarProduto(@RequestBody Produto produto){
        return productService.salvarProduto(produto);
    }
}
