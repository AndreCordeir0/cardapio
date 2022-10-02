package com.example.cardapio.dao;

import com.example.cardapio.Entities.Cardapio;
import org.springframework.data.repository.CrudRepository;

public interface IAbstractDAO extends CrudRepository<Cardapio, Long> {


}
