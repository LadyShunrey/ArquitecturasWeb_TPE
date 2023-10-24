package com.app.monopatin.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParadaDTO {
	private Long idParada;
	
	private String ubicacion;

	public ParadaDTO(Long idParada, String ubicacion) {
		this.idParada = idParada;
		this.ubicacion = ubicacion;
	}

	public Long getIdParada() {
		return idParada;
	}

	public void setIdParada(Long idParada) {
		this.idParada = idParada;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "ParadaDTO [idParada=" + idParada + ", ubicacion=" + ubicacion + "]";
	}
}
