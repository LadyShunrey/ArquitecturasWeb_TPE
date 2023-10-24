package com.app.viaje.domain;

import lombok.Data;

@Data
public class Tarifa {
    Double tarifaRegular;
    Double tarifaExtra;

    public Tarifa() {
    }

    public Tarifa(Double tarifaRegular, Double tarifaExtra) {
        this.tarifaRegular = tarifaRegular;
        this.tarifaExtra = tarifaExtra;
    }
}
