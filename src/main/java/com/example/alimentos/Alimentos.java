package com.example.alimentos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import me.tell.alimentos.AnadirAlimentoResponse;
import me.tell.alimentos.AnadirAlimentoRequest;
import me.tell.alimentos.BusquedaAlimentoResponse;
import me.tell.alimentos.BusquedaAlimentoRequest;
import me.tell.alimentos.ModificarAlimentoRequest;
import me.tell.alimentos.ModificarAlimentoResponse;
import me.tell.alimentos.EliminarAlimentoResponse;
import me.tell.alimentos.EliminarAlimentoRequest;

//DTO

@Entity
public class Alimentos{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String descripcion;
    private Integer precio;
    private Integer cantidad_existente;
    private String fecha_elaboracion;
    private String fecha_caducidad;
    private String categoria;

    public String getNombre() {
        return nombre;        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion ) {
        this.descripcion = descripcion;        
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;        
    }
    
    public Integer getCantidadExistente(){
        return cantidad_existente;
    }
    
    public void setCantidadExistente(Integer cantidad_existente){
        this.cantidad_existente=cantidad_existente;
    }
    
    public String getFechaElaboracion(){
        return fecha_elaboracion;
    }
    
    public void setFechaElaboracion(String fecha_elaboracion){
        this.fecha_elaboracion=fecha_elaboracion;
    }
    
    public String getFechaCaducidad(){
        return fecha_caducidad;
    }
    
    public void setFechaCaducidad(String fecha_caducidad){
        this.fecha_caducidad=fecha_caducidad;
    }
    
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria=categoria;
    }
    
} 