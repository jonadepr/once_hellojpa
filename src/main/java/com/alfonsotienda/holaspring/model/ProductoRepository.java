package com.alfonsotienda.holaspring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * ProductoRepository
 */
@Repository
public interface ProductoRepository
    extends CrudRepository<Producto, Integer>{

    
}