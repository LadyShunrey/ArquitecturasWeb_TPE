package com.app.viaje.controller;

import com.app.viaje.service.ViajeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/viajes")
public class ViajeController {
    private ViajeService viajeService;


    public ViajeController() {
    }

    public ViajeController(ViajeService viajeService) {
        this.viajeService = viajeService;
    }

}
