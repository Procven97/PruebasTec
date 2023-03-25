/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba.prueba2.repositorios;

import com.prueba.prueba2.modelos.Factura;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author famil
 */
public interface FacturaRepository extends JpaRepository<Factura, Long> {
       @Query("select f from Factura f where f.id_cliente = :id_client")
        List<Factura> busca_Por_Id_Cliente(@Param("id_client") int id_cleinte); 


}
