package com.app.usuario.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.usuario.service.CuentaService;

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
}
