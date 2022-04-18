/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.serviciosrest.service;

import java.util.List;
import java.util.Optional;
import pe.com.serviciosrest.entity.Producto;

/**
 *
 * @author CHRISTIAN JH
 */
public interface ProductoService {
    List<Producto> finAll();
    
    Optional<Producto> findById(Long id);
    
    List<Producto> findByName(String name);
    
    Producto add(Producto c);
    
    Producto update(Producto c);
 
    Producto delete(Producto c);
    
}
