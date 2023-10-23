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
	@Column(name="en_mantenimiento")
	private boolean enMantenimiento;
	@Column(name = "ubicacion")
	private String ubicacion;
	
	//no estoy segura de si poner los kilómetros y el tiempo de uso por todo lo que charlamos
	
	
	public Monopatin(Long idMonopatin, boolean enMantenimiento, String ubicacion) {
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
	
	
}
