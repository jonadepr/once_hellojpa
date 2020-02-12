package com.alfonsotienda.holaspring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Factura
 * POJO: Plain Old Java Object
 * Entity es para generar la entidad en base de datos en base al objeto
 * 
 * Usar las  siguientes anotaciones para clientes 
 * @GeneratedValue es para el autoincremental (buscar)
 * Otra es @NotNull
 * Otra es @Max o @Min
 * Otra es @Size
 * 
 */

@Entity
public class Factura {

    @Id
    private Integer id;

    private String fecha;

    private Double total;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}