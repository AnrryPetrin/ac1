package com.example.ac1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ac1.model.Categoria;
import com.example.ac1.repository.CategoriaRepository;

@RestController
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @PostMapping("/categorias/insert")
    public ResponseEntity<Void> insertCategoria(@RequestBody Categoria categoria) {
        categoriaRepository.insert(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/categorias/get-all")
    public List<Categoria> getAllCategorias() {
        return categoriaRepository.findAll();
    }

}
