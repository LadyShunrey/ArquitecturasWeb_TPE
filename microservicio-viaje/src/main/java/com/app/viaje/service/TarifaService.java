package com.app.viaje.service;


import com.app.viaje.domain.Tarifa;
import com.app.viaje.dto.TarifaDTO;
import com.app.viaje.repository.TarifaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.hibernate.sql.ast.SqlTreeCreationLogger.LOGGER;


@Service
public class TarifaService {
    private TarifaRepository tarifaRepository;

    public TarifaService() {
    }

    public TarifaService(TarifaRepository tarifaRepository) {
        this.tarifaRepository = tarifaRepository;
    }

    public List<TarifaDTO> listarTarifas(){
        return this.tarifaRepository.findAll().stream().map(tarifa->new TarifaDTO(tarifa.getIdTarifa(), tarifa.getTarifaRegular(), tarifa.getTarifaPausa(), tarifa.getTarifaExtra())).toList();
    }

    @Transactional
    public Optional<TarifaDTO> buscarTarifaPorId(Long idTarifa){
        return this.tarifaRepository.findById(idTarifa).map(tarifa -> new TarifaDTO(tarifa.getIdTarifa(), tarifa.getTarifaRegular(), tarifa.getTarifaPausa(), tarifa.getTarifaExtra()));
    }

    public void eliminarTarifa(Long idTarifa) {
        this.tarifaRepository.deleteById(idTarifa);
    }

    @Transactional
    public Tarifa actualizarTarifa(Tarifa tarifa) {
        // Obtenemos el registro a actualizar
        Tarifa registroActualizado = tarifaRepository.findById(tarifa.getIdTarifa()).orElseThrow();

        // Actualizamos los datos que queremos modificar
        registroActualizado.setTarifaRegular(tarifa.getTarifaRegular());
        registroActualizado.setTarifaPausa(tarifa.getTarifaPausa());
        registroActualizado.setTarifaExtra(tarifa.getTarifaExtra());

        // Guardamos el registro actualizado
        tarifaRepository.save(registroActualizado);
        return registroActualizado;
    }

    @Transactional
    public boolean agregarTarifa(Tarifa tarifa) {
        if (this.tarifaRepository.existsById(tarifa.getIdTarifa()))
            return false;
        this.tarifaRepository.save(tarifa);
        return true;
    }
}
