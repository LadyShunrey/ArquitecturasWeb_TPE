package com.app.monopatin.domain;






import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
public class Parada {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idParada;
	@Column(name = "latitud")
	private String latitud;
	@Column(name = "longitud")
	private String longitud;
	@OneToMany(mappedBy = "parada", cascade = CascadeType.MERGE)
	@JsonManagedReference
	private List<Monopatin> monopatines;


	public Parada(Long idParada, String latitud, String longitud) {
		this.idParada = idParada;
		this.latitud = latitud;
		this.longitud = longitud;
	}


	public Long getIdParada(){
		return idParada;
	}
	public void setIdParada(Long idParada) {
		this.idParada = idParada;
	}

	public String getLatitud() {
		return latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
}
