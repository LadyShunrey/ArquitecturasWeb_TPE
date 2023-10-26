package com.app.administracion.dto;



public class Monopatin {
    private Long idMonopatin;
    private Double kilometros;
    private Double tiempo;
    private boolean enMantenimiento;
    private boolean enUso;
    private String latitud;
    private String longitud;


    public Monopatin() {
    }

    public Monopatin(Long idMonopatin, Double kilometros, Double tiempo, boolean enMantenimiento, boolean enUso, String latitud, String longitud) {
        this.idMonopatin = idMonopatin;
        this.kilometros = kilometros;
        this.tiempo = tiempo;
        this.enMantenimiento = enMantenimiento;
        this.enUso = enUso;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Long getIdMonopatin() {
        return idMonopatin;
    }

    public void setIdMonopatin(Long idMonopatin) {
        this.idMonopatin = idMonopatin;
    }

    public Double getKilometros() {
        return kilometros;
    }

    public void setKilometros(Double kilometros) {
        this.kilometros = kilometros;
    }

    public Double getTiempo() {
        return tiempo;
    }

    public void setTiempo(Double tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isEnMantenimiento() {
        return enMantenimiento;
    }

    public void setEnMantenimiento(boolean enMantenimiento) {
        this.enMantenimiento = enMantenimiento;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
    public boolean isEnUso() {
        return enUso;
    }

    public void setEnUso(boolean enUso) {
        this.enUso = enUso;
    }
}
