package com.app.parada.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.parada.domain.Parada;
import com.app.parada.dto.ParadaDTO;
import com.app.parada.service.ParadaService;

@RestController
@RequestMapping("api/paradas")
public class ParadaController {
	private ParadaService paradaService;

	public ParadaController(ParadaService paradaService) {
		this.paradaService = paradaService;
	}
	
	@GetMapping("")
	public List<ParadaDTO> listarParadas() {
		return this.paradaService.listarParadas();
	}
}
