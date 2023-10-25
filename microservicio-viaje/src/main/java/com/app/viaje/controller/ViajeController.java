package com.app.viaje.controller;

import com.app.viaje.domain.Viaje;
import com.app.viaje.dto.ViajeDTO;
import com.app.viaje.service.ViajeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/viajes")
public class ViajeController {
    private ViajeService viajeService;


    public ViajeController() {
    }

    public ViajeController(ViajeService viajeService) {
        this.viajeService = viajeService;
    }

    @GetMapping("")
    public List<ViajeDTO> listarViajes (){
        return this.viajeService.listarViajes();
    }
    @GetMapping("/viaje/{idViaje}")
    public Optional<ViajeDTO> buscarViajePorId (@PathVariable Long idViaje){
        return this.viajeService.buscarViajePorId(idViaje);
    }
    @PostMapping("")
    public Viaje agregarViaje (Viaje viaje) throws Exception {
        return this.viajeService.agregarViaje(viaje);
    }
    @PutMapping("")
    public Viaje actualizarViaje (Viaje viaje){
        return this.viajeService.actualizarViaje(viaje);
    }

    @DeleteMapping("/viaje/{idViaje}")
    public void eliminarViaje (@PathVariable Long idViaje){
        this.viajeService.eliminarViaje(idViaje);
    }


}
