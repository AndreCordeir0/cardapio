package com.example.cardapio.services;

import com.example.cardapio.Entities.Cardapio;
import com.example.cardapio.dao.impl.CardapioDAO;
import com.example.cardapio.dto.CardapioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;

@Service
public class CardapioService {


    @Autowired
    CardapioDAO cardapioDAO;

    @Transactional
    public CardapioDTO salvarCardapio(CardapioDTO cardapioDTO){
        Cardapio cardapio = new Cardapio();
        cardapio.setId(cardapioDTO.getId());
        cardapio.setNomeComida(cardapioDTO.getNomeComida());
        cardapioDAO.create(cardapio);
        return cardapioDTO;
    }

}

