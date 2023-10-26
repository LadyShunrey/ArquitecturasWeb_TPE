package com.app.administracion.dto;

public class EmpleadoDTO {
    private Long idEmpleado;
    private String rol;
    private String nombre;
    private String apellido;


    public EmpleadoDTO() {
    }

    public EmpleadoDTO(Long idEmpleado, String rol, String nombre, String apellido) {
        this.idEmpleado = idEmpleado;
        this.rol = rol;
        this.nombre = nombre;
        this.apellido = apellido;
    }


}
