package com.app.usuario.controller;

import com.app.usuario.dto.CuentaDTO;
import org.springframework.web.bind.annotation.*;

import com.app.usuario.service.CuentaService;

import java.util.List;

@RestController
@RequestMapping("api/cuentas")
public class CuentaController {
	private CuentaService cuentaService;

	public CuentaController(CuentaService cuentaService) {
		this.cuentaService = cuentaService;
	}
	
	@DeleteMapping("/cuenta/{idCuenta}")
	public void eliminarCuenta(@PathVariable Long idCuenta) {
		this.cuentaService.eliminarCuentaPorID(idCuenta);
	}

	@GetMapping("")
	public List<CuentaDTO> listarCuentas (){
		return this.cuentaService.listarCuentas();
	}
}
