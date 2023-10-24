package com.app.monopatin.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.monopatin.domain.Parada;
import com.app.monopatin.dto.ParadaDTO;
import com.app.monopatin.service.ParadaService;

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
