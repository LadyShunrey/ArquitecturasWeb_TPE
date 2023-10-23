package com.app.cuenta.domain;

import java.time.LocalDate;

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
public class Cuenta {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCuenta;
	
	@Column(name="fecha_alta")
	private LocalDate fechaAlta;
	
//	@Column(name="cuenta_pago")
//	private String cuentaPago;
	
	@Column(name="dinero_disponible")
	private Double dineroDisponible;
	
	//la cuenta tiene que tener una lista de usuarios asociada
	
//	@OneToMany(mappedBy = "cuenta", cascade = CascadeType.MERGE)
//	@JsonManagedReference
//	private List<Usuario> usuarios;
}
