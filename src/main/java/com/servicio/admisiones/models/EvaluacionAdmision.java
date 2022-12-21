package com.servicio.admisiones.models;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="evaluacion")
public class EvaluacionAdmision {
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private int id;
    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate fecha;
    
    @Column(nullable=false)
    private Integer puntosHojaVida;
    
    @Column(nullable=false)
    private Integer puntosExperiencia;
    
    @Column(nullable=false)
    private Integer puntosPostgrados;
    
    @Column(nullable=false)
    private Integer puntosCertificaciones;
    
    @Column(nullable=false)
    private Integer puntosIngles;
    
    @Column(nullable=false)
    private Integer totalPuntos;
    
    @ManyToOne
    @JoinColumn(name="aspirante_id")
    private Aspirante aspirante;
    
    @ManyToOne
    @JoinColumn(name="cargo_id")
    private Cargo cargo;
    
    @ManyToOne
    @JoinColumn(name="estado_id")
    private EstadoAdmision estado;
    
    public EvaluacionAdmision() {
    }

    public EvaluacionAdmision(int id, LocalDate fecha, int puntosHojaVida, int puntosExperiencia, int puntosPostgrados, int puntosCertificaciones, int puntosIngles, int totalPuntos) {
        this.id = id;
        this.fecha = fecha;
        this.puntosHojaVida = puntosHojaVida;
        this.puntosExperiencia = puntosExperiencia;
        this.puntosPostgrados = puntosPostgrados;
        this.puntosCertificaciones = puntosCertificaciones;
        this.puntosIngles = puntosIngles;
        this.totalPuntos = totalPuntos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getPuntosHojaVida() {
        return puntosHojaVida;
    }

    public void setPuntosHojaVida(int puntosHojaVida) {
        this.puntosHojaVida = puntosHojaVida;
    }

    public int getPuntosExperiencia() {
        return puntosExperiencia;
    }

    public void setPuntosExperiencia(int puntosExperiencia) {
        this.puntosExperiencia = puntosExperiencia;
    }

    public int getPuntosPostgrados() {
        return puntosPostgrados;
    }

    public void setPuntosPostgrados(int puntosPostgrados) {
        this.puntosPostgrados = puntosPostgrados;
    }

    public int getPuntosCertificaciones() {
        return puntosCertificaciones;
    }

    public void setPuntosCertificaciones(int puntosCertificaciones) {
        this.puntosCertificaciones = puntosCertificaciones;
    }

    public int getPuntosIngles() {
        return puntosIngles;
    }

    public void setPuntosIngles(int puntosIngles) {
        this.puntosIngles = puntosIngles;
    }

    public int getTotalPuntos() {
        return totalPuntos;
    }

    public void setTotalPuntos(int totalPuntos) {
        this.totalPuntos = totalPuntos;
    }
}
