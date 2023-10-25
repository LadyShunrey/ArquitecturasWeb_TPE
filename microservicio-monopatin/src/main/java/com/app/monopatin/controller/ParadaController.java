package com.app.monopatin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

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
	@GetMapping("/parada/{idParada}")
	public Optional<ParadaDTO> buscarParadaPorId(@PathVariable Long idParada) {
		return this.paradaService.buscarParadaPorId(idParada);
	}

	@DeleteMapping("/parada/{idParada}")
	public void eliminarParada(@PathVariable Long idParada){
		this.paradaService.eliminarParada(idParada);
	}

	@PostMapping("")
	public Parada agregarParada (Parada parada) throws Exception {
		return this.paradaService.agregarParada(parada);
	}

	@PutMapping("")
	public Parada actualizarParada (Parada parada){
		return this.paradaService.actualizarParada(parada);
	}
}
