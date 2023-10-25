package com.app.viaje.service;


import com.app.viaje.domain.Tarifa;
import com.app.viaje.dto.TarifaDTO;
import com.app.viaje.repository.TarifaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.hibernate.sql.ast.SqlTreeCreationLogger.LOGGER;


@Service
public class TarifaService {
    private TarifaRepository tarifaRepository;

    public TarifaService() {
    }

    public TarifaService(TarifaRepository tarifaRepository) {
        this.tarifaRepository = tarifaRepository;
    }

    public List<TarifaDTO> getTarifaById(Long idTarifa){
        return this.tarifaRepository.getTarifaById(idTarifa).stream()
                .map(tarifa -> new TarifaDTO(tarifa.getIdTarifa(), tarifa.getTarifaRegular(), tarifa.getTarifaPausa(), tarifa.getTarifaExtra()))
                .toList();
    }

    public void eliminarTarifa(Long idTarifa) {
        this.tarifaRepository.deleteById(idTarifa);
    }

    @Transactional
    public boolean actualizarTarifa(Tarifa tarifa) {
        if (!this.tarifaRepository.existsById(tarifa.getIdTarifa()))
            return false;
        this.tarifaRepository.save(tarifa);
        return true;
    }

    @Transactional
    public boolean agregarTarifa(Tarifa tarifa) {
        if (this.tarifaRepository.existsById(tarifa.getIdTarifa()))
            return false;
        this.tarifaRepository.save(tarifa);
        return true;
    }
}
