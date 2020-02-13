package com.alfonsotienda.holaspring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * LineaRepository
 */
@Repository
public interface LineaRepository
    extends CrudRepository<Linea, Integer>{

    
}