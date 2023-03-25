/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba.prueba2.repositorios;

import com.prueba.prueba2.modelos.Detalle;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author famil
 */
public interface DetalleRepository extends JpaRepository<Detalle, Long>{
           @Query("select d from Detalle d where d.num_factura = :num_factur")
        List<Detalle> busca_Detalle_x_Factura(@Param("num_factur") int num_factura);
}
