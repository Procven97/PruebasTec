/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba.prueba2.repositorios;

import com.prueba.prueba2.modelos.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author famil
 */
public interface ClienteRepository  extends JpaRepository<Cliente, Long >{
    
}
