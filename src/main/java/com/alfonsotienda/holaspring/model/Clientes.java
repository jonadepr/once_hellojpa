package com.alfonsotienda.holaspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Clientes
 * POJO: Plain Old Java Object
 * Entity es para generar la entidad en base de datos en base al objeto
 * 
 * Usar las  siguientes anotaciones para clientes 
 * @GeneratedValue es para el autoincremental (buscar) en id
 * Otra es @NotNull en edad
 * Otra es @Max o @Min en edad
 * Otra es @Size por ejemplo @Size(min = 3, max = 15)
 * 
 */
@Entity
public class Clientes {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=3, max=20)
    private String nombre;

    @Size(min=10, max=100)
    private String apellidos;

    @NotNull
    @Max(65)
    @Min(18)
    private int edad;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    


}