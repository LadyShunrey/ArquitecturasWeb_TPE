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

	//boolean enPausa?
	
	//tiempo en pausa
	@Column(name="tiempo_pausa")
	private Double tiempoPausa; //capaz habría que pasar todos a LocalTime?
	
	@Column(name="tiempo_total")
	private Double tiempoTotal; //resta de fecha fin- inicio
	
	//precio total del viaje
	@Column(name="precio_total")
	private Double precioTotal; //este es la cuenta de: tarifaBasica*(tiempoTotal-tiempoPausa) + tarifaExtra*tiempoPausa

	public Viaje(Long idViaje, LocalDate fechaInicio, LocalDate fechaFin, Double kilometros, Double tiempoPausa, Double tiempoTotal, Double precioTotal) {
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

	public Double getPrecioTotal(Tarifa tarifa) {
		return precioTotal = tarifa.getTarifaRegular() * (tiempoTotal-tiempoPausa) + tarifa.getTarifaPausa() * tiempoPausa;
	}

	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	
}
