package com.example.cardapio.rest;


import com.example.cardapio.dto.CardapioDTO;
import com.example.cardapio.services.CardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/cardapio")
public class CardapioRest {

    @Autowired
    CardapioService cardapioService;


    @PostMapping(value = "/salvar")
    public ResponseEntity<CardapioDTO> salvarCardapio(@RequestBody CardapioDTO cardapioDTO){
        var cardapio = cardapioService.salvarCardapio(cardapioDTO);
        return ResponseEntity.ok(cardapio);
    }
}
