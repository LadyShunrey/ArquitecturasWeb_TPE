package com.app.monopatin.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter @Setter
@Entity
@NoArgsConstructor
public class Monopatin {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idMonopatin;
	@Column(name = "kilometros_recorridos")
	private Double kilometros;
	@Column(name = "tiempo_uso")
	private Double tiempo;
	@Column(name = "en_mantenimiento")
	private boolean enMantenimiento;
	@Column (name = "latitud")
	private String latitud;
	@Column (name = "longitud")
	private String longitud;
	
	//no estoy segura de si poner los kilómetros y el tiempo de uso por todo lo que charlamos


	public Monopatin(Long idMonopatin, Double kilometros, Double tiempo, boolean enMantenimiento, String latitud, String longitud) {
		this.idMonopatin = idMonopatin;
		this.kilometros = kilometros;
		this.tiempo = tiempo;
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
}
