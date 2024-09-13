package com.example.ac1.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.ac1.model.Produto;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class ProdutoRepository {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void insert(Produto produto) {
        entityManager.merge(produto);
    }

    @Transactional
    public List<Produto> findAll() {
        return entityManager.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
    }

    @Transactional
    public Produto findById(int id_produto) {
        return entityManager.find(Produto.class, id_produto);
    }

    @Transactional
    public void delete(int id_produto) {
        Produto produto = entityManager.find(Produto.class, id_produto);
        entityManager.remove(produto);
    }
}
