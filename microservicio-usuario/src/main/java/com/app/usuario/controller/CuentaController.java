package com.app.usuario.controller;

import com.app.usuario.domain.Cuenta;
import com.app.usuario.dto.CuentaDTO;
import org.springframework.web.bind.annotation.*;

import com.app.usuario.service.CuentaService;

import java.util.List;
import java.util.Optional;

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
	public List<CuentaDTO> listarCuentas () {
		return this.cuentaService.listarCuentas();
	}
	@GetMapping("/cuenta/{idCuenta}")
	public Optional<CuentaDTO> buscarCuentaPorId (@PathVariable Long idCuenta){
		return this.cuentaService.buscarCuentaPorID(idCuenta);
	}
	@PutMapping("")
	public Cuenta actualizarCuenta (Cuenta cuenta) {
		return this.cuentaService.actualizarCuenta(cuenta);
	}

	@PostMapping("")
	public Cuenta agregarCuenta (Cuenta cuenta) throws Exception {
		return this.cuentaService.agregarCuenta(cuenta);
	}

}
