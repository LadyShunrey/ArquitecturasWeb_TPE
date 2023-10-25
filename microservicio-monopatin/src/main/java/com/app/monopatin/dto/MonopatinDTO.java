package com.app.monopatin.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MonopatinDTO {

	private Long idMonopatin;
	private boolean enMantenimiento;
	private String latitud;
	private String longitud;

	public MonopatinDTO(Long idMonopatin, boolean enMantenimiento, String latitud, String longitud) {
		this.idMonopatin = idMonopatin;
		this.enMantenimiento = enMantenimiento;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public Long getIdMonopatin() {
		return idMonopatin;
	}

	public void setIdMonopatin(Long idMonopatin) {
		this.idMonopatin = idMonopatin;
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

	@Override
	public String toString() {
		return "MonopatinDTO{" +
				"idMonopatin=" + idMonopatin +
				", enMantenimiento=" + enMantenimiento +
				", latitud='" + latitud + '\'' +
				", longitud='" + longitud + '\'' +
				'}';
	}
}
