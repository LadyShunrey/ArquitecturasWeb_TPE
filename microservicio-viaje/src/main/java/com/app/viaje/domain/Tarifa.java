package com.app.viaje.domain;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Tarifa {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long idTarifa;
    @Column (name = "tarifa-regular")
    Double tarifaRegular;
    @Column (name = "tarifa-pausa")
    Double tarifaPausa;
    @Column (name = "tarifa-extra")
    Double tarifaExtra;

    public Tarifa() {
    }

    public Tarifa(Long idTarifa, Double tarifaRegular, Double tarifaPausa, Double tarifaExtra) {
        this.idTarifa = idTarifa;
        this.tarifaRegular = tarifaRegular;
        this.tarifaPausa = tarifaPausa;
        this.tarifaExtra = tarifaExtra;
    }


    public Long getIdTarifa() {
        return idTarifa;
    }

    public Double getTarifaRegular() {
        return tarifaRegular;
    }

    public Double getTarifaPausa() {
        return tarifaPausa;
    }

    public Double getTarifaExtra() {
        return tarifaExtra;
    }

}
