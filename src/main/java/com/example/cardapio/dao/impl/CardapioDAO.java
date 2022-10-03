package com.example.cardapio.dao.impl;

import com.example.cardapio.Entities.Cardapio;
import com.example.cardapio.dao.GenericDAO;
import com.example.cardapio.dto.CardapioDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CardapioDAO extends GenericDAO<Cardapio> {
    @PersistenceContext
    private EntityManager entityManager;
    public List<Cardapio> listarTodos(){
        return this.entityManager.createQuery("from Cardapio").getResultList();
    }
}
