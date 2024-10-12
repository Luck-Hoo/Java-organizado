package io.github.lucasNunes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double preco;
<<<<<<< HEAD:7 - Treino de 06.10.24 - SpringBootComIntellij/SpringBootIntellij/src/main/java/io/github/lucasNunes/model/Produto.java
    //Testando 07.10.24
    //Testando 08.10.24
    //Testando 09.10.24
    //Testando 10.10.24
=======

>>>>>>> origin/notebookDell:7 - Treino de 06.10.24 - SpringBootComIntellij/SpringBootIntellij/src/main/java/io/github/lucasNunes/model/Client.java
    // Getters e Setters
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Double getPreco(){
        return preco;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }
}
