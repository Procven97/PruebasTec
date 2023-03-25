/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.prueba2.modelos;

import jakarta.persistence.*;

/**
 *
 * @author famil
 */
@Entity
@Table(schema = "detalle")
public class Detalle {
    
    @Id
    private Long num_detalle;
    
    @Column
    private Long num_factura;
    
    @Column
    private Long id_producto;
    
    @Column
    private int cantidad;
    
    @Column
    private Float precio;

    public Long getNum_detalle() {
        return num_detalle;
    }

    public void setNum_detalle(Long num_detalle) {
        this.num_detalle = num_detalle;
    }

    public Long getNum_factura() {
        return num_factura;
    }

    public void setNum_factura(Long num_factura) {
        this.num_factura = num_factura;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }


   
}
