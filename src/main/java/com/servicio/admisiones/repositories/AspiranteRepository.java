package com.servicio.admisiones.repositories;

import com.servicio.admisiones.models.Aspirante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AspiranteRepository extends JpaRepository<Aspirante, Integer>{
    
}
