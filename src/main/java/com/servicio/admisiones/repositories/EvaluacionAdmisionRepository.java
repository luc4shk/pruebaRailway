
package com.servicio.admisiones.repositories;

import com.servicio.admisiones.models.EvaluacionAdmision;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluacionAdmisionRepository extends JpaRepository<EvaluacionAdmision, Integer> {
    
}
