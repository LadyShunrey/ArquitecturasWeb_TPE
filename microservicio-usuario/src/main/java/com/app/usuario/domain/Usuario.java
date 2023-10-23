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
}