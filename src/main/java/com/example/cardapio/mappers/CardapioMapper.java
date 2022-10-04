package com.example.cardapio.mappers;

import com.example.cardapio.Entities.Cardapio;
import com.example.cardapio.dto.CardapioDTO;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Mapper
public interface CardapioMapper {
    CardapioMapper INSTANCE = Mappers.getMapper(CardapioMapper.class);

    Cardapio toCardapio (CardapioDTO cardapioDTO);

    CardapioDTO toCardapioDTO (Cardapio cardapio);
    default List<CardapioDTO> listaCardapioToDTO(List<Cardapio> listaCardapio){
        List<CardapioDTO> listaCardapioDTO = new ArrayList<CardapioDTO>();
        listaCardapio.stream()
                .filter(f-> Objects.nonNull(f))
                .forEach(lic->{
                    CardapioDTO cardapioDTO = new CardapioDTO();
                    cardapioDTO.setId(lic.getId());
                    cardapioDTO.setNomeComida(lic.getNomeComida());
                    listaCardapioDTO.add(cardapioDTO);
                });
        return listaCardapioDTO;
    };

}
