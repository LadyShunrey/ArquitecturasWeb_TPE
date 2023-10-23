package com.app.monopatin.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MonopatinDTO {
	private Long idMonopatin;
	
	private boolean enMantenimiento;
	
	private String ubicacion;

	public MonopatinDTO(Long idMonopatin, boolean enMantenimiento, String ubicacion) {
		this.idMonopatin = idMonopatin;
		this.enMantenimiento = enMantenimiento;
		this.ubicacion = ubicacion;
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

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "MonopatinDTO [idMonopatin=" + idMonopatin + ", enMantenimiento=" + enMantenimiento + ", ubicacion="
				+ ubicacion + "]";
	}
}
