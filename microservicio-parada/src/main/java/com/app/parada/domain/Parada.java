package com.app.parada.domain;






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
}
