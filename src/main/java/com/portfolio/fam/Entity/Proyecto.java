package com.portfolio.fam.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreP;
    private String descripcionP;
    private String fechaInicioP;
    private String fechaFinP;

    public Proyecto() {
    }

    public Proyecto(String nombreP, String descripcionP, String fechaInicioP, String fechaFinP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.fechaInicioP = fechaInicioP;
        this.fechaFinP = fechaFinP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }    
    
    public String getFechaInicioP() {
        return fechaInicioP;
    }

    public void setFechaInicioP(String fechaInicioP) {
        this.fechaInicioP = fechaInicioP;
    }
    
    public String getFechaFinP() {
        return fechaFinP;
    }

    public void setFechaFinP(String fechaFinP) {
        this.fechaFinP = fechaFinP;
    }
}
