package com.servicio.admisiones.repositories;

import com.servicio.admisiones.models.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo, Integer> {
    
}
