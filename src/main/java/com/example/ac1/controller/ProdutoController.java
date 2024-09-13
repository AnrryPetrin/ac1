package com.example.ac1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.ac1.model.Produto;
import com.example.ac1.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping("/produtos/insert")
    public ResponseEntity<Void> insertProduto(@RequestBody Produto produto) {
        produtoRepository.insert(produto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/produtos/get-all")
    public List<Produto> getAllProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/produtos/get/{id_produto}")
    public Produto getProdutoById(@PathVariable int id_produto) {
        return produtoRepository.findById(id_produto);
    }

}
