package com.app.usuario.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Cuenta {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCuenta;
	
	@Column(name="fecha_alta")
	private LocalDate fechaAlta;
	
	@Column(name="cuenta_pago")
	private String cuentaPago;
	
	@Column(name="dinero_disponible")
	private Double dineroDisponible;
	
	@OneToMany(mappedBy = "cuenta", cascade = CascadeType.MERGE)
	@JsonManagedReference
	private List<Usuario> usuarios;
	
	public Cuenta(Long idCuenta, LocalDate fechaAlta, String cuentaPago, Double dineroDisponible) {
		this.idCuenta = idCuenta;
		this.fechaAlta = fechaAlta;
		this.cuentaPago = cuentaPago;
		this.dineroDisponible = dineroDisponible;
		this.usuarios = new ArrayList<Usuario>();
	}

	public Long getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Long idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getCuentaPago() {
		return cuentaPago;
	}

	public void setCuentaPago(String cuentaPago) {
		this.cuentaPago = cuentaPago;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Double getDineroDisponible() {
		return dineroDisponible;
	}

	public void setDineroDisponible(Double dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
	}


}
