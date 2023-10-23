package com.app.viaje.domain;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Viaje {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idViaje;
	
	//cuenta de usuario
	
	//fecha de inicio
	@Column(name="fecha_inicio")
	private LocalDate fechaInicio;
	
	//fecha de fin
	@Column(name="fecha_fin")
	private LocalDate fechaFin;
	
	//kilometros recorridos
	@Column(name="kilometros")
	private Double kilometros;
	
	//tarifa basica
	@Column(name="tarifa_basica")
	private Double tafifaBasica;
	
	//tarifa extra
	@Column(name="tarifa_extra")
	private Double tarifaExtra;
	
	//boolean enPausa?
	
	//tiempo en pausa
	@Column(name="tiempo_pausa")
	private LocalTime tiempoPausa; //capaz habría que pasar todos a LocalTime?
	
	@Column(name="tiempo_total")
	private LocalTime tiempoTotal; //resta de fecha fin- inicio
	
	//precio total del viaje
	@Column(name="precio_total")
	private Double precioTotal; //este es la cuenta de: tarifaBasica*(tiempoTotal-tiempoPausa) + tarifaExtra*tiempoPausa

	public Viaje(Long idViaje, LocalDate fechaInicio, LocalDate fechaFin, Double kilometros, Double tafifaBasica,
			Double tarifaExtra, LocalTime tiempoPausa, LocalTime tiempoTotal, Double precioTotal) {
		this.idViaje = idViaje;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.kilometros = kilometros;
		this.tafifaBasica = tafifaBasica;
		this.tarifaExtra = tarifaExtra;
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

	public Double getTafifaBasica() {
		return tafifaBasica;
	}

	public void setTafifaBasica(Double tafifaBasica) {
		this.tafifaBasica = tafifaBasica;
	}

	public Double getTarifaExtra() {
		return tarifaExtra;
	}

	public void setTarifaExtra(Double tarifaExtra) {
		this.tarifaExtra = tarifaExtra;
	}

	public LocalTime getTiempoPausa() {
		return tiempoPausa;
	}

	public void setTiempoPausa(LocalTime tiempoPausa) {
		this.tiempoPausa = tiempoPausa;
	}

	public LocalTime getTiempoTotal() {
		return tiempoTotal;
	}

	public void setTiempoTotal(LocalTime tiempoTotal) {
		this.tiempoTotal = tiempoTotal;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	
}
