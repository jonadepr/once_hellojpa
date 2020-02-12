package com.alfonsotienda.holaspring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * ClientesRepository.findAll() mirar los demás después del punto
 * Devuelve Iterable<T> y findAll() Returns all instances of the type.
 */

@Repository
public interface ClientesRepository
    extends CrudRepository<Clientes, Long>{

}