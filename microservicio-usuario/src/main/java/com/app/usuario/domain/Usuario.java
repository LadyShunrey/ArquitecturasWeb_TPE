package com.app.usuario.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter @Setter
@Entity
@NoArgsConstructor

public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idUsuario;
    @Column (name = "nombre_usuario")
    private String nombreUsuario;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "apellido")
    private String apellido;
    @Column (name = "numero_celular")
    private String numeroCelular;
    @Column (name = "email")
    private String email;
    @Column (name = "dni")
    private Long dni;
    @Column (name = "ubicacion")
    private String ubicacion;
    
    //el user tiene que tener una lista de cuentas asociada

    public Usuario(Long idUsuario, String nombreUsuario, String nombre, String apellido, String numeroCelular, String email, Long dni, String ubicacion) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCelular = numeroCelular;
        this.email = email;
        this.dni = dni;
        this.ubicacion = ubicacion;
    }

	public Long getIdUsuario() {
		return idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public String getEmail() {
		return email;
	}

	public Long getDni() {
		return dni;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
    
    
}