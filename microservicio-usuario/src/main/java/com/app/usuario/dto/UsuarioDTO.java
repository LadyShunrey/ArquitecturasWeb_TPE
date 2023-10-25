package com.app.usuario.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UsuarioDTO {

    private Long idUsuario;
    private String nombreUsuario;
    private String nombre;
    private String apellido;
    private String numeroCelular;
    private String email;
    private Long dni;
    private String latitud;
    private String longitud;

    public UsuarioDTO(Long idUsuario, String nombreUsuario, String nombre, String apellido, String numeroCelular, String email, Long dni, String latitud, String longitud) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCelular = numeroCelular;
        this.email = email;
        this.dni = dni;
        this.latitud = latitud;
        this.longitud = longitud;
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

    public String getLatitud() {
        return latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" +
                "idUsuario=" + idUsuario +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroCelular='" + numeroCelular + '\'' +
                ", email='" + email + '\'' +
                ", dni=" + dni +
                '}';
    }
}
