package com.app.viaje.service;

import com.app.viaje.dto.ViajeDTO;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.app.viaje.repository.ViajeRepository;
import com.app.viaje.domain.Viaje;

import java.util.List;

@Service
public class ViajeService {

    private ViajeRepository viajeRepository;

    public ViajeService(ViajeRepository viajeRepository) {
        this.viajeRepository = viajeRepository;
    }

    @Transactional
    public Viaje save(Viaje entity) throws Exception {
        try {
            return this.viajeRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public List<ViajeDTO> getAllViajes() {
        return this.viajeRepository.getAllViajes().stream()
                .map(viaje -> new ViajeDTO(viaje.getIdViaje(), viaje.getFechaInicio(), viaje.getFechaFin(), viaje.getKilometros(), viaje.getTiempoPausa(), viaje.getTiempoTotal(),viaje.getPrecioTotal()))
                .toList();

    }

    public void eliminarViaje(Long idViaje) {
        this.viajeRepository.deleteById(idViaje);
    }


}
