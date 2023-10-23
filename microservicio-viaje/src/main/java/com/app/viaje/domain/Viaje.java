package com.app.viaje.domain;

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
	
	//fecha de fin
	
	//kilometros recorridos
	
	//tarifa basica
	
	//tarifa extra
	
	//boolean enPausa?
	
	//tiempo en pausa
}
