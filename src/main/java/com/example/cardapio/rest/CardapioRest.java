package com.example.cardapio.rest;


import com.example.cardapio.Entities.Cardapio;
import com.example.cardapio.dto.CardapioDTO;
import com.example.cardapio.services.CardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RestController
@RequestMapping(path = "/cardapio")
public class CardapioRest {

    @Autowired
    CardapioService cardapioService;

    @PostMapping(value = "/salvar")
    public ResponseEntity<CardapioDTO> salvarCardapio(@RequestBody CardapioDTO cardapioDTO){
        CardapioDTO cardapio = cardapioService.salvarCardapio(cardapioDTO);
        return ResponseEntity.ok(cardapio);
    }

    @GetMapping(produces = { "application/json" })
    @CrossOrigin(origins = "*")
    public ResponseEntity<List<CardapioDTO>> listarTodosCardapios(){
        return ResponseEntity.ok(cardapioService.getCardapios());
    }
}
