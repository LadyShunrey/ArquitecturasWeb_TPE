package com.app.viaje.service;

import com.app.viaje.dto.ViajeDTO;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.app.viaje.repository.ViajeRepository;
import com.app.viaje.domain.Viaje;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class ViajeService {

    private ViajeRepository viajeRepository;

    public ViajeService(ViajeRepository viajeRepository) {
        this.viajeRepository = viajeRepository;
    }

    @Transactional
    public Viaje agregarViaje(Viaje viaje) throws Exception {
        try {
            return this.viajeRepository.save(viaje);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public List<ViajeDTO> listarViajes() {
        return this.viajeRepository.findAll().stream()
                .map(viaje -> new ViajeDTO(viaje.getIdViaje(), viaje.getFechaInicio(), viaje.getFechaFin(), viaje.getKilometros(), viaje.getTiempoPausa(), viaje.getTiempoTotal(),viaje.getPrecioTotal()))
                .toList();

    }

    @DeleteMapping
    public void eliminarViaje(Long idViaje) {
        this.viajeRepository.deleteById(idViaje);
    }

    @Transactional
    @GetMapping("/viaje/{idViaje}")
    public Optional<ViajeDTO> buscarViajePorId(Long idViaje) {
        return this.viajeRepository.findById(idViaje).map(viaje -> new ViajeDTO(viaje.getIdViaje(), viaje.getFechaInicio(), viaje.getFechaFin(), viaje.getKilometros(), viaje.getTiempoPausa(), viaje.getTiempoTotal(),viaje.getPrecioTotal()));
    }
    @Transactional
    public Viaje actualizarViaje(Viaje viaje) {
        // Obtenemos el registro a actualizar
        Viaje registroActualizado = viajeRepository.findById(viaje.getIdViaje()).orElseThrow();

        // Actualizamos los datos que queremos modificar
        registroActualizado.setFechaInicio(viaje.getFechaInicio());
        registroActualizado.setFechaFin(viaje.getFechaFin());
        registroActualizado.setKilometros(viaje.getKilometros());
        registroActualizado.setTiempoPausa(viaje.getTiempoPausa());
        registroActualizado.setTiempoTotal(viaje.getTiempoTotal());

        // Guardamos el registro actualizado
        viajeRepository.save(registroActualizado);
        return registroActualizado;
    }
}
