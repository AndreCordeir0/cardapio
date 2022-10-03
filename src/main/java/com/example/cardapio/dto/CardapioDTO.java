package com.example.cardapio.dto;

import lombok.*;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class CardapioDTO implements Serializable {


    private static final long serialVersionUID = -628673791593982317L;

    private  Long id;

    @Size(max = 100)
    private  String nomeComida;
}