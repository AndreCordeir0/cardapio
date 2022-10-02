package com.example.cardapio.dto;

import lombok.*;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link com.example.cardapio.Entities.Cardapio} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CardapioDTO implements Serializable {
    private  Long id;

    @Size(max = 100)
    private  String nomeComida;
}