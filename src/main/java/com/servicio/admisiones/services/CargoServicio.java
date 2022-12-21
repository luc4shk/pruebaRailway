
package com.servicio.admisiones.services;

import com.servicio.admisiones.models.Cargo;
import com.servicio.admisiones.repositories.CargoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargoServicio {
    
    @Autowired
    private CargoRepository repo;
    
    public List<Cargo> listar() {
        return (List<Cargo>) repo.findAll();
    }
    
    public void guardar(Cargo cargo){
        repo.save(cargo);
    }
    
    public Cargo listarId(int id) {
        return repo.findById(id).get();
    }
    
     public void delete(Integer id){
        repo.deleteById(id);
    }
}
