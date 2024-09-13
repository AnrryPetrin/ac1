package com.example.ac1.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.ac1.model.Categoria;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class CategoriaRepository {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void insert(Categoria categoria) {
        entityManager.merge(categoria);
    }

    @Transactional
    public List<Categoria> findAll() {
        return entityManager.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList();
    }

    @Transactional
    public Categoria findById(int id_categoria) {
        return entityManager.find(Categoria.class, id_categoria);
    }

    @Transactional
    public void delete(int id_categoria) {
        Categoria categoria = entityManager.find(Categoria.class, id_categoria);
        entityManager.remove(categoria);
    }

}
