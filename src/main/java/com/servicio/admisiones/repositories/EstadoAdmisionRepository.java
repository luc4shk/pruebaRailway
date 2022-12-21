package com.servicio.admisiones.repositories;

import com.servicio.admisiones.models.EstadoAdmision;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoAdmisionRepository extends JpaRepository<EstadoAdmision, Integer>{
    
}
