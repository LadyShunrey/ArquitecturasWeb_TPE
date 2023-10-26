package com.app.administracion.domain;

import com.app.administracion.dto.Monopatin;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Mantenimiento {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idMantenimiento;
    private ArrayList<Monopatin> monopatinesEnMantenimiento;

    public Mantenimiento() {
    }

    public Long getIdMantenimiento() {
        return idMantenimiento;
    }

    public void setIdMantenimiento(Long idMantenimiento) {
        this.idMantenimiento = idMantenimiento;
    }
}
