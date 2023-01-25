package com.portfolio.fam.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProyecto {
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private String fechaInicioP;
    @NotBlank
    private String fechaFinP;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcionP, String fechaInicioP, String fechaFinP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.fechaInicioP = fechaInicioP;
        this.fechaFinP = fechaFinP;
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
