
package com.servicio.admisiones.services;

import com.servicio.admisiones.models.Aspirante;
import com.servicio.admisiones.repositories.AspiranteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AspiranteServicio{
    
    @Autowired
    private AspiranteRepository repo;
    
    public List<Aspirante> listar() {
        return (List<Aspirante>) repo.findAll();
    }
    
    public void guardar(Aspirante aspirante){
        repo.save(aspirante);
    }
    
    public Aspirante listarId(int id) {
        return repo.findById(id).get();
    }
    
     public void delete(Integer id){
        repo.deleteById(id);
    }

    
}
