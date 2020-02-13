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

    @Id // Pk no nula
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO) // Autoincremental
    private int id;

    @NotNull
    @Size(min=3, max=20)
    private String nombre;

    @Size(min=3, max=100)
    private String apellidos;

    @NotNull
    @Max(value = 65)
    @Min(value = 18)
    private int edad;

    public Clientes(){

    }

    public Clientes(@NotNull @Size(min = 3, max = 20) String nombre, @Size(min = 3, max = 100) String apellidos,
    @NotNull @Max(65) @Min(18) int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public String toString(){
        return "id: "+id+", nombre: "+nombre+", apellidos: "+apellidos+", edad: "+edad;
    }



}