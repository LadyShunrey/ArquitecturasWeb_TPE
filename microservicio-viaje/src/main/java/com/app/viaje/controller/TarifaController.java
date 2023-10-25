package com.app.viaje.controller;

import com.app.viaje.domain.Tarifa;
import com.app.viaje.dto.TarifaDTO;
import com.app.viaje.service.TarifaService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TarifaController {
    private TarifaService tarifaService;

    public TarifaController(TarifaService tarifaService) {
        this.tarifaService = tarifaService;
    }

    @GetMapping("/tarifa/{idTarida}")
    public List<TarifaDTO> getTarifaById(@PathVariable Long idTarifa){
        return this.tarifaService.getTarifaById(idTarifa);
    }

    @Transactional
    @DeleteMapping("/tarifa/{idTarida}")
    public void eliminarTarifa(Long idTarifa){
        this.tarifaService.eliminarTarifa(idTarifa);
    }
    @Transactional
    public boolean actualizarTarifa(Tarifa tarifa){
        return this.tarifaService.actualizarTarifa(tarifa);
    }

    @PostMapping("")
    public boolean agregarTarifa(Tarifa tarifa) {
        return this.tarifaService.agregarTarifa(tarifa);
    }

}
