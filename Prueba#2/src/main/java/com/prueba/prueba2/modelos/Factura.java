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
@Table(schema = "factura")
public class Factura {
    
    @Id
    private Long num_factura;
    
    @Column
    private Long id_cliente;
    
    @Column
    private String fecha;

    public Long getNum_factura() {
        return num_factura;
    }

    public void setNum_factura(Long num_factura) {
        this.num_factura = num_factura;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


      
}


