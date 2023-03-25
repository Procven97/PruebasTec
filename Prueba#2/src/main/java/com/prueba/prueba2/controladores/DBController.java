/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.prueba2.controladores;

import com.prueba.prueba2.modelos.Cliente;
import com.prueba.prueba2.modelos.Detalle;
import com.prueba.prueba2.modelos.Factura;
import com.prueba.prueba2.modelos.Producto;
import com.prueba.prueba2.repositorios.ClienteRepository;
import com.prueba.prueba2.repositorios.DetalleRepository;
import com.prueba.prueba2.repositorios.FacturaRepository;
import com.prueba.prueba2.repositorios.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author famil
 */
@RestController
public class DBController {

    
    //Servicios de la tabla clientes
     @Autowired
    ClienteRepository clienterepository;
    
     //Consulta de todos los clientes
    @GetMapping(value = "/clientes")
    public List <Cliente> getClientes(){
        return clienterepository.findAll();
    }
    //Creacion de un cliente
    @PostMapping(value = "/createcliente")
    public String createCliente (@RequestBody Cliente cliente){
        clienterepository.save(cliente);
        return "Cliente creado";
    }
    
    
    //Servicios de la tabla producto
     @Autowired
    ProductoRepository producto_Repository;
    
     //Consulta de todos los productos
    @GetMapping(value = "/producto")
    public List <Producto> getProducto(){
       return producto_Repository.findAll();
    }
    
    //Creacion de un producto
    @PostMapping(value = "/createproducto")
    public String createProducto (@RequestBody Producto producto){
        producto_Repository.save(producto);
        return "Producto creado";
    }
    
    
   //Servicios de la tabla factura 
    @Autowired
    FacturaRepository factura_Repository;
    
    //Consulta de todas las facturas
    @GetMapping(value = "/facturas")
    public List<Factura> getFactura(){
        return factura_Repository.findAll();
    }
    
    //Creacion de un factura
    @PostMapping(value = "/createfactura")
    public  String createFactura(@RequestBody Factura factura){
           String resp;
        
        try {
               factura_Repository.save(factura);
               resp = "Factura creada";
             
        }catch (InternalError | Exception  a){
            resp = "Error: El cliente no existe";
        }   
       
        return resp;
    }
    
    //Consulta de facturas por cliente
    @GetMapping(value = "/facturas_cliente")
    public List<Factura> getFactura_Cliente(@RequestBody int id){
       return factura_Repository.busca_Por_Id_Cliente(id);
    }
    
    
    
    //Sevicios de la tabla detalle
    @Autowired
    DetalleRepository detalle_Repository;
    
    //Consulta de todos los dealles
    @GetMapping(value = "/detalle_factura")
    public List<Detalle> getDetalle_Factura(){
        return detalle_Repository.findAll();
    }
    
    //Creacion de un detalle
    @PostMapping(value = "/createdetalle_factura")
    public  String createDetalle_Factura(@RequestBody Detalle detalle_factura){
        String resp;
        Float cantidad  = (float) detalle_factura.getCantidad();     
          Float resultado  = cantidad * producto_Repository.findById(detalle_factura.getId_producto()).get().getPrecio();
          detalle_factura.setPrecio(resultado);
        
        try {
               detalle_Repository.save(detalle_factura);
               resp = "Detalle de factura creado";
             
        }catch (InternalError | Exception  a){
            resp = "Erro: Porducto o factura no existen";
        }   
       
        return resp;
    } 
    
    //Consulta de los detalles de una factura
    @GetMapping(value = "/detalles_x_factura")
    public List<Detalle> getDetalles_Por_Facturas(@RequestBody int num_factura){
        return detalle_Repository.busca_Detalle_x_Factura(num_factura);
    }
}  
