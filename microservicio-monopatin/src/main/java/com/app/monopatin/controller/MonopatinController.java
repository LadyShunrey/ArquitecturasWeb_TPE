package com.app.monopatin.controller;

import java.util.List;
import java.util.Optional;

import com.app.monopatin.domain.Monopatin;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.invoker.PathVariableArgumentResolver;

import com.app.monopatin.dto.MonopatinDTO;
import com.app.monopatin.service.MonopatinService;


@RestController
@RequestMapping("api/monopatines")
public class MonopatinController {
	private MonopatinService monopatinService;

	public MonopatinController(MonopatinService monopatinService) {
		this.monopatinService = monopatinService;
	}
	
	@GetMapping("")
	public List<MonopatinDTO> getAll(){
		return this.monopatinService.getAllMonopatinOrderByID();
    }
	@GetMapping("/monopatin/{id}")
	public Optional<MonopatinDTO> getMonopatinById(Long idMonopatin){
		return this.monopatinService.getMonopatinById(idMonopatin);
	}
	
	@DeleteMapping("/id/{id}")
	public void eliminarMonopatin(@PathVariable Long idMonopatin) {
		this.monopatinService.eliminarMonopatin(idMonopatin);
	}

	@PostMapping("")
	public Monopatin agregarMonopatin(Monopatin monopatin) throws Exception {
		return this.monopatinService.agregarMonopatin(monopatin);
	}

}
