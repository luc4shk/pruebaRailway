
package com.servicio.admisiones.services;

import com.servicio.admisiones.models.EstadoAdmision;
import com.servicio.admisiones.repositories.EstadoAdmisionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoAdmisionServicio {
    
    @Autowired
    private EstadoAdmisionRepository repo;
    
    public List<EstadoAdmision> listar() {
        return (List<EstadoAdmision>) repo.findAll();
    }
    
    public void guardar(EstadoAdmision estado){
        repo.save(estado);
    }
    
    public EstadoAdmision listarId(int id) {
        return repo.findById(id).get();
    }
    
     public void delete(Integer id){
        repo.deleteById(id);
    }
}
