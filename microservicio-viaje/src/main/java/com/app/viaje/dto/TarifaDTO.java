package com.app.viaje.dto;

import lombok.Data;



@Data
public class TarifaDTO {
    Long idTarifa;
    Double tarifaRegular;
    Double tarifaPausa;
    Double tarifaExtra;

    public TarifaDTO(Long idTarifa, Double tarifaRegular, Double tarifaPausa, Double tarifaExtra) {
        this.idTarifa = idTarifa;
        this.tarifaRegular = tarifaRegular;
        this.tarifaPausa = tarifaPausa;
        this.tarifaExtra = tarifaExtra;
    }

}
