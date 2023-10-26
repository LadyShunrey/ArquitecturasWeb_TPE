package com.app.administracion.service;


import com.app.administracion.domain.Empleado;
import com.app.administracion.dto.EmpleadoDTO;
import com.app.administracion.repository.EmpleadoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {
    private EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @Transactional
    public Empleado actualizarEmpleado(Empleado empleado) {
        // Obtenemos el registro a actualizar
        Empleado registroActualizado = empleadoRepository.findById(empleado.getIdEmpleado()).orElseThrow();

        // Actualizamos los datos que queremos modificar
        registroActualizado.setRol(empleado.getRol());
        registroActualizado.setNombre(empleado.getNombre());
        registroActualizado.setApellido(empleado.getApellido());

        // Guardamos el registro actualizado
        empleadoRepository.save(registroActualizado);
        return registroActualizado;
    }


    public void eliminarEmpleado(Long idEmpleado) {
        this.empleadoRepository.deleteById(idEmpleado);
    }
    @Transactional
    public Empleado agregarEmpleado(Empleado empleado) {
        return this.empleadoRepository.save(empleado);
    }

    public List<EmpleadoDTO> listarEmpleados() {
        return this.empleadoRepository.findAll().stream().map(empleado->new EmpleadoDTO(empleado.getIdEmpleado(), empleado.getRol(), empleado.getNombre(), empleado.getApellido())).toList();
    }

    public Optional<EmpleadoDTO> buscarEmpleadoPorId(Long idEmpleado){
        return this.empleadoRepository.findById(idEmpleado).map(empleado->new EmpleadoDTO(empleado.getIdEmpleado(), empleado.getRol(), empleado.getNombre(), empleado.getApellido()));
    }

}
