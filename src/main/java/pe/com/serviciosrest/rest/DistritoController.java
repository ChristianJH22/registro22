package pe.com.serviciosrest.rest;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.serviciosrest.entity.Categoria;
import pe.com.serviciosrest.entity.Cliente;
import pe.com.serviciosrest.entity.Distrito;
import pe.com.serviciosrest.rest.rquest.DistritoRequest;
import pe.com.serviciosrest.service.DistritoService;


@RestController
@RequestMapping("/distrito")
public class DistritoController {
    
    @Autowired
    private DistritoService distritoservice;
    
    @GetMapping
    public List<Distrito> findAll(){
        return distritoservice.finAll();
    }
    
    @PostMapping
    public Distrito add(@RequestBody Distrito d){
        return distritoservice.add(d);
    }
    
    @GetMapping("/{id}")
    public Optional<Distrito> findById(@PathVariable long id){
        return distritoservice.findById(id);
    }
    
    @PostMapping("by-name")
    public List<Distrito> findByname(@RequestBody DistritoRequest distritoRequest){
        return distritoservice.findByName(distritoRequest.getNombre());
    }
    
    
    //ACTUALIZAR
    @PutMapping("/{id}")
    public Distrito update(@PathVariable long id, @RequestBody Distrito d){
        d.setCodigo(id);
        return distritoservice.update(d);
    };
    
    //ELIMINAR
    @DeleteMapping("/{id}")
    public Distrito delete(@PathVariable long id){
        Distrito objdistrito = new Distrito(); 
        objdistrito.setCodigo(id);
        return distritoservice.delete(Distrito.builder().codigo(id).build());
    };
}
