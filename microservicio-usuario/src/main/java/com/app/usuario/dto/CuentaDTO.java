package com.app.usuario.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CuentaDTO {
	private Long idCuenta;
	private LocalDate fechaAlta;
	private String cuentaPago;
	private Double dineroDisponible;
	
	public CuentaDTO(Long idCuenta, LocalDate fechaAlta, String cuentaPago, Double dineroDisponible) {
		this.idCuenta = idCuenta;
		this.fechaAlta = fechaAlta;
		this.cuentaPago = cuentaPago;
		this.dineroDisponible = dineroDisponible;
	}

	public Long getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Long idCuenta) {
		this.idCuenta = idCuenta;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	
	public Double getDineroDisponible() {
		return dineroDisponible;
	}

	public void setDineroDisponible(Double dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
	}

	@Override
	public String toString() {
		return "CuentaDTO [idCuenta=" + idCuenta + ", fechaAlta=" + fechaAlta + ", dineroDisponible= "+ dineroDisponible+"]";
	}
	
	
}
