package pe.com.serviciosrest.rest;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.serviciosrest.entity.Categoria;
import pe.com.serviciosrest.rest.rquest.CategoriaRequest;
import pe.com.serviciosrest.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;
    
    //MOSTRAR
    @GetMapping
    public List<Categoria> findAll(){
        return categoriaService.finAll();
    }
    
    
    //AGREGAR
    @PostMapping
    public Categoria add(@RequestBody Categoria c){
        return categoriaService.add(c);
    }
    
    
    @GetMapping("/{id}")
    public Optional<Categoria> findById(@PathVariable long id){
        return categoriaService.findById(id);
    }
    
    
    @PostMapping("by-name")
    public List<Categoria> findByname(@RequestBody CategoriaRequest categoriaRequest){
        return categoriaService.findByName(categoriaRequest.getNombre());
    }
    
    
    //ACTUALIZAR
    @PutMapping("/{id}")
    public Categoria update(@PathVariable long id, @RequestBody Categoria c){
        c.setCodigo(id);
        return categoriaService.update(c);
    };
    
    
    //ELIMINAR
    @DeleteMapping("/{id}")
    public Categoria delete(@PathVariable long id){
        Categoria objcategoria = new Categoria(); 
        objcategoria.setCodigo(id);
        return categoriaService.delete(Categoria.builder().codigo(id).build());
    };
}
