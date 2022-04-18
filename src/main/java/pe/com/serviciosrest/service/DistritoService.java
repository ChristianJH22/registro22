package pe.com.serviciosrest.service;

import java.util.List;
import java.util.Optional;
import pe.com.serviciosrest.entity.Distrito;

public interface DistritoService {
    
    List<Distrito> finAll();
    
    Optional<Distrito> findById(Long id);
    
    List<Distrito> findByName(String name);
    
    Distrito add(Distrito c);
    
    Distrito update(Distrito c);
 
    Distrito delete(Distrito c);
}
