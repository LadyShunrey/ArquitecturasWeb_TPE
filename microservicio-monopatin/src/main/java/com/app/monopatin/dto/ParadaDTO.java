package com.app.monopatin.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParadaDTO {

	private Long idParada;
	private String latitud;
	private String longitud;

	public ParadaDTO(Long idParada, String latitud, String longitud) {
		this.idParada = idParada;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public Long getIdParada() {
		return idParada;
	}

	public void setIdParada(Long idParada) {
		this.idParada = idParada;
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

	@Override
	public String toString() {
		return "ParadaDTO{" +
				"idParada=" + idParada +
				", latitud='" + latitud + '\'' +
				", longitud='" + longitud + '\'' +
				'}';
	}
}
