package com.alfonsotienda.holaspring.model;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * Producto
 */
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Size(max = 300)
    @NotNull
    @Column(name = "name", nullable = false)
    private String nombre;

    private Double precio;

    /**Iniciamos la lista para que no sea nula aunque tenga
     * cero elementos
     */
    @ManyToMany(mappedBy = "productos")
    private ArrayList<Factura> facturas = new ArrayList<Factura>() {
    };

    public Producto(@Size(max = 300) String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String concepto) {
        this.nombre = concepto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}