package com.app.administracion.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idEmpleado;
    @Column(name = "rol")
    private String rol;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "apellido")
    private String apellido;

    public Empleado() {
    }

    public Empleado(Long idEmpleado, String rol, String nombre, String apellido) {
        this.idEmpleado = idEmpleado;
        this.rol = rol;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
