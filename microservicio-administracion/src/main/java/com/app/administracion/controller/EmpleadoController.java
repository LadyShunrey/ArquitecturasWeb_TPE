package com.app.administracion.controller;

import com.app.administracion.domain.Empleado;
import com.app.administracion.dto.EmpleadoDTO;
import com.app.administracion.service.EmpleadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("empleados")
public class EmpleadoController {
    private EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @PostMapping("")
    public Empleado agregarEmpleado (Empleado empleado){
        return this.empleadoService.agregarEmpleado(empleado);
    }

    @PutMapping("")
    public Empleado actualizarEmpleado (Empleado empleado){
        return this.empleadoService.actualizarEmpleado(empleado);
    }

    @DeleteMapping("/empleado/{idEmpleado}")
    public void eliminarEmpleado(@PathVariable Long idEmpleado){
        this.empleadoService.eliminarEmpleado(idEmpleado);
    }

    @GetMapping("")
    public List<EmpleadoDTO> listarEmpleados (){
        return this.empleadoService.listarEmpleados();
    }

    @GetMapping("/empleado/{idEmpleado}")
    public Optional<EmpleadoDTO> buscarEmpleadoPorId (@PathVariable Long idEmpleado) {
        return this.empleadoService.buscarEmpleadoPorId(idEmpleado);
    }



}
