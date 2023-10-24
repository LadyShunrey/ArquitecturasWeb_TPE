package com.app.monopatin.domain;






import jakarta.persistence.Column;
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
@NoArgsConstructor
public class Parada {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idParada;
	@Column(name = "ubicacion")
	private String ubicacion;
//	@OneToMany(mappedBy = "parada", cascade = CascadeType.MERGE)
//	@JsonManagedReference
//	private List<Monopatin> monopatines;
	public Parada(Long idParada, String ubicacion) {
		this.idParada = idParada;
		this.ubicacion = ubicacion;
	}
	public Long getIdParada() {
		return idParada;
	}
	public void setIdParada(Long idParada) {
		this.idParada = idParada;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
}
