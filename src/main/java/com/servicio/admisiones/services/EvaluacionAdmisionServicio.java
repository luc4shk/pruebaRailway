
package com.servicio.admisiones.services;

import com.servicio.admisiones.models.EvaluacionAdmision;
import com.servicio.admisiones.repositories.EvaluacionAdmisionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvaluacionAdmisionServicio {
    
    
    @Autowired
    private EvaluacionAdmisionRepository repo;
    
    public List<EvaluacionAdmision> listar() {
        return (List<EvaluacionAdmision>) repo.findAll();
    }
    
    public void guardar(EvaluacionAdmision evaluacion){
        repo.save(evaluacion);
    }
    
    public EvaluacionAdmision listarId(int id) {
        return repo.findById(id).get();
    }
    
     public void delete(Integer id){
        repo.deleteById(id);
    }
}
