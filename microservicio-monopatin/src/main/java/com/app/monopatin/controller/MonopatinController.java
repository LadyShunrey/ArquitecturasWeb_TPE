package com.app.monopatin.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
	
	@DeleteMapping("/id/{id}")
	public void eliminarMonopatin(@PathVariable Long idMonopatin) {
		this.monopatinService.eliminarMonopatin(idMonopatin);
	}
}
