package com.app.viaje.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ViajeDTO {
	private Long idViaje;
	
	private LocalDate fechaInicio;
	
	private LocalDate fechaFin;
	
	private Double kilometros;

	private Double tiempoPausa;
	
	private Double tiempoTotal;
	
	private Double precioTotal;

	public ViajeDTO(Long idViaje, LocalDate fechaInicio, LocalDate fechaFin, Double kilometros, Double tiempoPausa, Double tiempoTotal, Double precioTotal) {
		
		this.idViaje = idViaje;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.kilometros = kilometros;
		this.tiempoPausa = tiempoPausa;
		this.tiempoTotal = tiempoTotal;
		this.precioTotal = precioTotal;
	}

	public Long getIdViaje() {
		return idViaje;
	}

	public void setIdViaje(Long idViaje) {
		this.idViaje = idViaje;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Double getKilometros() {
		return kilometros;
	}

	public void setKilometros(Double kilometros) {
		this.kilometros = kilometros;
	}

	public Double getTiempoPausa() {
		return tiempoPausa;
	}

	public void setTiempoPausa(Double tiempoPausa) {
		this.tiempoPausa = tiempoPausa;
	}

	public Double getTiempoTotal() {
		return tiempoTotal;
	}

	public void setTiempoTotal(Double tiempoTotal) {
		this.tiempoTotal = tiempoTotal;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}

	@Override
	public String toString() {
		return "ViajeDTO [idViaje=" + idViaje + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", kilometros=" + kilometros + ", tiempoPausa=" + tiempoPausa + ", tiempoTotal=" + tiempoTotal
				+ ", precioTotal=" + precioTotal + "]";
	}
	
	
}
